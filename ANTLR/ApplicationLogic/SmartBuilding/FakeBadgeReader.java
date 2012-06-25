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

	BadgeListener badgeEventHandler = new BadgeListener() {

		public void onNewResponse(BadgeData response) {

			if (response.getBadgeEvent().equals("detected")) {

				BadgeDetectedStruct badgeDetectedStruct = new BadgeDetectedStruct(
						"11.30:34 AM", response.getBadgeID());
				setbadgeDetected(badgeDetectedStruct);
			} else {

				BadgeDisappearedStruct badgeDisappearedStruct = new BadgeDisappearedStruct(
						"11.30:34 AM", response.getBadgeID());
				setbadgeDisappeared(badgeDisappearedStruct);
			}
		}

	};

	@Override
	protected void handleExpiryOfTimer() {
		DummyBadgeReader.getInstance().getData(badgeEventHandler);
	}

}