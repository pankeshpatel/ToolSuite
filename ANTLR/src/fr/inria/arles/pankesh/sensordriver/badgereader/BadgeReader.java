package fr.inria.arles.pankesh.sensordriver.badgereader;

import fr.inria.arles.pankesh.sensordriver.Sensor;

public abstract interface BadgeReader extends Sensor {

	public abstract BadgeData getData();

	public abstract void getData(BadgeListener handler);
}
