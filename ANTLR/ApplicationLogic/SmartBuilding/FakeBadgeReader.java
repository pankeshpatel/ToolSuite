package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeData;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeListener;
import fr.inria.arles.pankesh.sensordriver.dummydevice.DummyBadgeReader;
import framework.BadgeDetectedStruct;
import framework.BadgeDisappearedStruct;
import framework.BadgeReader;

public class FakeBadgeReader extends BadgeReader {

	public FakeBadgeReader(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void handlebadgeDetected() {

	}

	@Override
	public void handlebadgeDisappeared() {

	}

	private boolean continueFlag = false;
	

	@Override
	public void run() {
		continueFlag = true;
		// while (true) {
		for(int i=0; i<=5; i++) {
		
		try {
			Thread.sleep(1000);
			handleExpiryOfTimer();
			// if (!continueFlag)
			// break;
		} catch (InterruptedException e) {
			e.printStackTrace();
			continueFlag = false;
		}
		// }
		
		}
	}

	BadgeListener badgeEventHandler = new BadgeListener() {

		public void onNewResponse(BadgeData response) {

			if (response.getBadgeEvent().equals("detected")) {

				BadgeDetectedStruct badgeDetectedStruct = new BadgeDetectedStruct(
						response.getBadgeID(), response.timestamp);
				setbadgeDetected(badgeDetectedStruct);
			} else {

				BadgeDisappearedStruct badgeDisappearedStruct = new BadgeDisappearedStruct(
						response.getBadgeID(), response.timestamp);
				setbadgeDisappeared(badgeDisappearedStruct);
			}
		}

	};

	@Override
	protected void handleExpiryOfTimer() {
		DummyBadgeReader.getInstance().getData(badgeEventHandler);
	}

}