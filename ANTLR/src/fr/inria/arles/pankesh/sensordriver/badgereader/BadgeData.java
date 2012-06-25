package fr.inria.arles.pankesh.sensordriver.badgereader;

import fr.inria.arles.pankesh.sensordriver.SensorData;

public class BadgeData extends SensorData {

	private String badgeEvent;
	private String badgeID;

	public BadgeData(String badgeEvent, String badgeID, long timestamp) {
		super(timestamp);
		this.badgeEvent = badgeEvent;
		this.badgeID = badgeID;
	}

	public String getBadgeEvent() {
		return badgeEvent;
	}

	public String getBadgeID() {
		return badgeID;
	}

}
