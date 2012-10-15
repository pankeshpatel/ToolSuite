package logic;

import fr.inria.arles.pankesh.factory.BadgeReaderSensorFactory;
import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeDetectListener;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeDisappearListener;
import fr.inria.arles.pankesh.sensordriver.badgereader.IBadgeReader;
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
		for (int i = 0; i <= 5; i++) {

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

	BadgeDetectListener badgeDetectEvent = new BadgeDetectListener() {

		@Override
		public void onNewBadgeDetect(BadgeDetectedStruct response) {
			BadgeDetectedStruct badgeDetectedStruct = new BadgeDetectedStruct(
					response.getbadgeID(), response.gettimeStamp());
			setbadgeDetected(badgeDetectedStruct);
		}
	};

	BadgeDisappearListener badgeDisappearedEvent = new BadgeDisappearListener() {

		@Override
		public void onNewBadgeDisappeared(BadgeDisappearedStruct response) {
			BadgeDisappearedStruct badgeDisappearedStruct = new BadgeDisappearedStruct(
					response.getbadgeID(), response.gettimeStamp());
			setbadgeDisappeared(badgeDisappearedStruct);
		}
	};

	@Override
	protected void handleExpiryOfTimer() {

		IBadgeReader badgeReader = BadgeReaderSensorFactory.getBadgeReaderSensor("motorola");
		
		if (Math.random() < 0.5) {
			
			badgeReader.getBadgeDetectData(badgeDetectEvent);
			
			//DummyBadgeReader.getInstance().getBadgeDetectData(badgeDetectEvent);
		} else {
			
			badgeReader.getBadgeDisappearedData(badgeDisappearedEvent);
			//DummyBadgeReader.getInstance().getBadgeDisappearedData(
			//		badgeDisappearedEvent);
		}
	}
}