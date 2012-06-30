package logic;

import fr.inria.arles.pankesh.pubsubmiddleware.PubSubMiddleware;
import fr.inria.arles.pankesh.semanticmodel.Device;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeData;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeListener;
import fr.inria.arles.pankesh.sensordriver.dummydevice.DummyBadgeReader;
import framework.SmokeDetector;
import framework.SmokePresenceStruct;

public class FakeSmokeDetector extends SmokeDetector {

	public FakeSmokeDetector(PubSubMiddleware pubSubM, Device deviceInfo) {
		super(pubSubM, deviceInfo);

	}

	@Override
	public void handlesmokePresence() {
		// TODO : write code Here
	}

	BadgeListener smokeEventHandler = new BadgeListener() {

		public void onNewResponse(BadgeData response) {

			if (response.getBadgeEvent().equals("detected")) {

				SmokePresenceStruct badgeDetectedStruct = new SmokePresenceStruct(
						true, response.timestamp);
				setsmokePresence(badgeDetectedStruct);
			} else {

				SmokePresenceStruct badgeDisappearedStruct = new SmokePresenceStruct(
						false, response.timestamp);

				setsmokePresence(badgeDisappearedStruct);

			}
		}

	};

	@Override
	protected void handleExpiryOfTimer() {
		DummyBadgeReader.getInstance().getData(smokeEventHandler);

	}

}