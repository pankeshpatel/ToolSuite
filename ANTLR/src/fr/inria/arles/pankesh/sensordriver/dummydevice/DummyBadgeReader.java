package fr.inria.arles.pankesh.sensordriver.dummydevice;

import fr.inria.arles.pankesh.sensordriver.SensorListener;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeData;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeListener;
import fr.inria.arles.pankesh.sensordriver.badgereader.BadgeReader;

public class DummyBadgeReader implements BadgeReader {

	static DummyBadgeReader singletonInstance;

	public static DummyBadgeReader getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new DummyBadgeReader();
		}
		return singletonInstance;
	}

	@Override
	public BadgeData getData() {

		long timestamp = ((long) (System.currentTimeMillis())) * 1000000;

		if (Math.random() < 0.5) {

			return new BadgeData("detected", "BadgeID-d001", timestamp);
		} else {

			return new BadgeData("disappeared", "BadgeID-d001", timestamp);
		}

	}

	@Override
	public void getData(BadgeListener handler) {

		handler.onNewResponse(this.getData());
	}

	@Override
	public void getData(SensorListener handler) {
		// TODO Auto-generated method stub

	}

}
