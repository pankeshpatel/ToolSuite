package fr.inria.arles.pankesh.pubsubmiddleware;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import util.RegionID;

import fr.inria.arles.pankesh.semanticmodel.Device;

public class PubSubMiddleware {

	private Map<String, Set<Subscriber>> subscriberMap = new Hashtable<String, Set<Subscriber>>();
	private Map<String, Set<CommandListener>> registeredInstanceMap = new Hashtable<String, Set<CommandListener>>();

	private Map<RegionID, Set<Subscriber>> regionSubscriber = new Hashtable<RegionID, Set<Subscriber>>();

	private Set<Subscriber> subscriberSet = new HashSet<Subscriber>();

	static PubSubMiddleware singletonInstance;

	public static PubSubMiddleware getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new PubSubMiddleware();
		}
		return singletonInstance;
	}

	public void subscribe(Subscriber s, String eventSignature,
			RegionID regionInfo) {

		registerNewSubscriber(s, eventSignature, regionInfo);
	}

	public void publish(String eventName, Object arg, Device deviceInfo) {

		Set<Subscriber> subscriberPatternSet = new HashSet<Subscriber>();

		// Get Exact match
		RegionID regionS1 = new RegionID(deviceInfo.getRegion().getCenter(),
				deviceInfo.getRegion().getFloor(), deviceInfo.getRegion()
						.getRoom());
		Set<Subscriber> s1 = regionSubscriber.get(regionS1);

		if (s1 != null) {
			subscriberPatternSet.addAll(s1);
		}

		// Get (7, 12, *) match

		RegionID regionS2 = new RegionID(deviceInfo.getRegion().getCenter(),
				deviceInfo.getRegion().getFloor(), "*");
		Set<Subscriber> s2 = regionSubscriber.get(regionS2);

		if (s2 != null) {
			subscriberPatternSet.addAll(s2);
		}

		// Get (7, *, *) match

		RegionID regionS3 = new RegionID(deviceInfo.getRegion().getCenter(),
				"*", "*");
		Set<Subscriber> s3 = regionSubscriber.get(regionS3);

		if (s3 != null) {
			subscriberPatternSet.addAll(s3);
		}

		// Get (7, *, *) match

		RegionID regionS4 = new RegionID("*", "*", "*");
		Set<Subscriber> s4 = regionSubscriber.get(regionS4);

		if (s4 != null) {
			subscriberPatternSet.addAll(s4);
		}

		Set<Subscriber> subscriberEventSet = getSubscribersForEvent(eventName);

		subscriberSet = SetOperations.intersection(subscriberEventSet,
				subscriberPatternSet);

		if (subscriberSet != null) {
			for (Subscriber s : subscriberSet) {
				s.notifyReceived(eventName, arg, deviceInfo);
			}
		}

		/*
		 * Set<Subscriber> subscriberEventSet =
		 * getSubscribersForEvent(eventName);
		 * 
		 * Set<Region> regions = deviceInfo.getRegion();
		 * 
		 * for (Region region : regions) { String regionID =
		 * region.getRegionID();
		 * 
		 * Set<Subscriber> subscriberSetRegionID =
		 * getSubscribersForRegionID(regionID);
		 * 
		 * subscriberSet = SetOperations.intersection(subscriberEventSet,
		 * subscriberSetRegionID);
		 * 
		 * }
		 * 
		 * if (subscriberSet != null) { for (Subscriber s : subscriberSet) {
		 * s.notifyReceived(eventName, arg, deviceInfo); } }
		 */
	}

	private Set<Subscriber> getSubscribersForEvent(String eventName) {

		return subscriberMap.get(eventName);
	}

	private void registerNewSubscriber(Subscriber s, String eSig,
			RegionID regionInfo) {

		/*
		 * if(cache.containsKey(eSig, regionInfo)){
		 * 
		 * @SuppressWarnings("unchecked") Set<Subscriber> tempSet =
		 * (Set<Subscriber>) cache.get(eSig, regionInfo); tempSet.add(s);
		 * 
		 * }else{ Set<Subscriber> newSet = new HashSet<Subscriber>();
		 * newSet.add(s); cache.put(eSig, regionInfo, s);
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(cache.get(regionInfo));
		 */

		/*
		 * for (String regionID : regionInfo.keySet()) { if
		 * (subscriberByRegionID.containsKey(regionID)) { Set<Subscriber>
		 * tempSet = subscriberByRegionID.get(regionID); tempSet.add(s); } else
		 * { Set<Subscriber> newSet = new HashSet<Subscriber>(); newSet.add(s);
		 * subscriberByRegionID.put(regionID, newSet); }
		 * 
		 * }
		 */

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

	// Request-Response

	public Object sendCommand(String methodName, Object arg, Device deviceInfo) {

		Set<CommandListener> registeredInstanceSet = getInstanceForCommand(methodName);

		if (registeredInstanceSet != null) {
			for (CommandListener s : registeredInstanceSet) {
				return s.commandReceived(methodName, arg, deviceInfo);
			}
		}
		return null;
	}

	private Set<CommandListener> getInstanceForCommand(String methodName) {
		return registeredInstanceMap.get(methodName);
	}

	private void registerNewInstance(CommandListener s, String listnerSignature) {

		if (registeredInstanceMap.containsKey(listnerSignature)) {
			Set<CommandListener> tempSet = registeredInstanceMap
					.get(listnerSignature);
			tempSet.add(s);
		} else {
			Set<CommandListener> newSet = new HashSet<CommandListener>();
			newSet.add(s);
			registeredInstanceMap.put(listnerSignature, newSet);
		}
	}

	public void registerInstance(CommandListener s, String listnerSignature) {
		registerNewInstance(s, listnerSignature);
	}

}
