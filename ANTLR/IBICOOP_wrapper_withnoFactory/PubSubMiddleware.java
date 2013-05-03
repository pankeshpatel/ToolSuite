package fr.inria.arles.pankesh.pubsubmiddleware;

import java.io.IOException;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.ibicoop.broker.common.BrokerConstants;
import org.ibicoop.broker.common.BrokerManager;
import org.ibicoop.broker.common.EventNotificationListener;
import org.ibicoop.broker.common.IbiResource;
import org.ibicoop.broker.common.IbiResourceEvent;
import org.ibicoop.broker.common.IbiTopic;
import org.ibicoop.broker.common.IbiTopicEvent;
import org.ibicoop.broker.common.IbiTopicFilter;
import org.ibicoop.init.IbicoopInit;

import fr.inria.arles.pankesh.common.RegionIDTables;
import fr.inria.arles.pankesh.semanticmodel.Device;

public class PubSubMiddleware implements EventNotificationListener {

	private IbicoopInit ibiInit = null;
	private String brokerName = "ibiBroker";
	private int brokerStatus = -1;
	BrokerManager brokerManager;

	private Map<String, Set<Subscriber>> subscriberMap = new Hashtable<String, Set<Subscriber>>();

	private Map<List<String>, Set<Subscriber>> regionSubscriber = new Hashtable<List<String>, Set<Subscriber>>();

	private Set<Subscriber> subscriberSet = Collections
			.synchronizedSet(new HashSet<Subscriber>());

	private List<String> pubSubRegionIDList = new ArrayList<String>();

	RegionIDTables regionIDtb = new RegionIDTables();

	static PubSubMiddleware singletonInstance;
	
	private static Object myContext = null;
	
	public static PubSubMiddleware getInstance(Device device, Object context) {
		
		myContext = context;

		if (singletonInstance == null) {
			singletonInstance = new PubSubMiddleware(device.getType(),
					device.getName());
		}
		return singletonInstance;
	}

	public PubSubMiddleware(String type, String name) {

		initialize(type, name);
                                                                                       
	}

	public void initialize(String type, String name) {

		Object[] ibicoopInput;
		if (type == "PC") {

			ibicoopInput = new Object[2];
			ibicoopInput[0] = name + "@ibicoop.org";
			ibicoopInput[1] = "testPasssword";

		} else {
			ibicoopInput = new Object[4];
			ibicoopInput[0] = myContext;
			ibicoopInput[1] = name + "@ibicoop.org";
			ibicoopInput[2] = "testPasssword";
			ibicoopInput[3] = name + "Dimitris";
		}

		ibiInit = IbicoopInit.getInstance();
		boolean status = ibiInit.start(ibicoopInput);
		System.err.println("status = " + status);

		brokerManager = ibiInit.getBrokerManager(brokerName);
		brokerManager.startNotification(this);

		waitForBrokerStatus(BrokerConstants.STATUS_BROKER_STARTED_WITH_NOTIFICATION);

	}

	/*
	 * Publish() function will publish data from software component, whenever it
	 * gets data from hardware sensor or other software component.
	 */

	public void publish(String topicName, Object arg, Device deviceInfo) {

		IbiTopicFilter topicFilter = brokerManager.createIbiTopicFilter();
		topicFilter.setName(topicName);
		IbiTopic[] topicList = brokerManager.getTopics(topicFilter);
		log("found %d topics in which i'll publish.", topicList.length);

		DataWrapper dw = new DataWrapper();
		dw.setObject(arg);
		dw.setDevice(deviceInfo);

		java.io.ByteArrayOutputStream bstream = new java.io.ByteArrayOutputStream();
		java.io.ObjectOutputStream st;

		try {
			st = new java.io.ObjectOutputStream(bstream);
			st.writeObject(dw);
			st.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] bytes = bstream.toByteArray();

		for (IbiTopic topic : topicList) {
			log("will publish in topic %s", topic.getName());
			IbiTopicEvent event = brokerManager.createIbiEvent("Event "
					+ System.currentTimeMillis(), "this is just a test", bytes);
			int result = topic.publishEvent(event);
			log("publish return code: %d", result);
		}

	}

	/*
	 * subscribe() function will subscribe component's interest to the
	 * middleware.
	 * 
	 * topicName : The eventName in which a component is in interest.
	 */

	public void subscribe(Subscriber s, String topicName,
			List<String> regionInfo) {
		registerNewSubscriber(s, topicName, regionInfo);
		IbiTopic ibiTopic = null;
		// first query the topic
		IbiTopicFilter topicFilter = brokerManager.createIbiTopicFilter();
		topicFilter.setName(topicName);
		IbiTopic[] topicList = brokerManager.getTopics(topicFilter);

		// no topics, create it
		if (topicList.length == 0) {
			ibiTopic = brokerManager.createIbiTopic(topicName,
					"This is just a test");

			ibiTopic.registerTopic();

		} else {
			ibiTopic = topicList[0];
		}

		ibiTopic.subscribe();

	}

	private void waitForBrokerStatus(int code) {
		int retry = 3;
		while (retry > 0 && brokerStatus != code) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			retry--;
		}
	}

	private Set<Subscriber> getSubscribersForEvent(String eventName) {

		return subscriberMap.get(eventName);
	}

	private void registerNewSubscriber(Subscriber s, String eSig,
			List<String> regionInfo) {

		if (regionSubscriber.containsKey(regionInfo)) {
			Set<Subscriber> tempSet = regionSubscriber.get(regionInfo);
			tempSet.add(s);
			regionSubscriber.put(regionInfo, tempSet);

		} else {

			Set<Subscriber> newSet = new HashSet<Subscriber>();
			newSet.add(s);
			regionSubscriber.put(regionInfo, newSet);
		}

		// create Map by EventName

		if (subscriberMap.containsKey(eSig)) {

			Set<Subscriber> tempSet = subscriberMap.get(eSig);
			tempSet.add(s);
		} else {
			Set<Subscriber> newSet = new HashSet<Subscriber>();
			newSet.add(s);
			subscriberMap.put(eSig, newSet);
		}

	}

	@Override
	public boolean acceptNotificationFrom(String eventPublisher) {
		return true;
	}

	@Override
	public void brokerStatus(String brokerName, int statusCode) {
		log("brokerStatus(brokerName=%s, statusCode=%d);", brokerName,
				statusCode);
		brokerStatus = statusCode;
	}

	@Override
	public void receiveEvent(IbiTopic forTopic, IbiTopicEvent event) {
		Object obj = null;

		log("receiveEvent(forTopic = %s, event = %s)", forTopic.getName(),
				event.getName());

		java.io.ByteArrayInputStream bstream = new java.io.ByteArrayInputStream(
				event.getData());
		try {
			java.io.ObjectInputStream st = new java.io.ObjectInputStream(
					bstream);
			obj = st.readObject();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DataWrapper dt = (DataWrapper) obj;

		Set<Subscriber> subscriberPatternSet = new HashSet<Subscriber>();

		pubSubRegionIDList = dt.getDevice().getRegion();

		for (int i = 0; i <= pubSubRegionIDList.size(); i++) {

			List<String> regionIDResult = regionIDtb.getRegionIDField(i,
					pubSubRegionIDList);

			Set<Subscriber> s = regionSubscriber.get(regionIDResult);

			if (s != null) {
				subscriberPatternSet.addAll(s);
			}

		}

		Set<Subscriber> subscriberEventSet = getSubscribersForEvent(forTopic
				.getName());

		subscriberSet = SetOperations.intersection(subscriberEventSet,
				subscriberPatternSet);

		if (subscriberSet != null) {
			for (Subscriber s : subscriberSet) {
				s.notifyReceived(forTopic.getName(), dt.getObject(),
						dt.getDevice());
			}
		}

	}

	@Override
	public void receiveEvent(IbiTopic forTopic, IbiResourceEvent resourceEvent) {
		log("receiveEvent(forTopic = %s, publisher = %s)", forTopic.getName(),
				resourceEvent.getPublisher());
	}

	@Override
	public void receiveEvent(IbiResource forResource,
			IbiResourceEvent resourceEvent) {
		log("receiveEvent(forResource = %s, publisher = %s)",
				forResource.getResName(), resourceEvent.getPublisher());
	}

	private static void log(String format, Object... args) {
		System.err.println("[LOG] " + String.format(format, args));
	}

}
