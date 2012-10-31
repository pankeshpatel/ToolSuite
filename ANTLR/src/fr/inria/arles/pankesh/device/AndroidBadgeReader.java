package fr.inria.arles.pankesh.device;

import framework.BadgeDetectedStruct;
import framework.BadgeDisappearedStruct;
import framework.IBadgeReader;
import framework.ListenerbadgeDetected;
import framework.ListenerbadgeDisappeared;

public class AndroidBadgeReader implements IBadgeReader {

	@Override
	public BadgeDisappearedStruct getbadgeDisappeared() {
		long timestamp = ((long) (System.currentTimeMillis())) * 1000000;
		return new BadgeDisappearedStruct("2", timestamp);
	}

	@Override
	public void getbadgeDisappeared(ListenerbadgeDisappeared handler) {
		handler.onNewbadgeDisappeared(this.getbadgeDisappeared());

	}

	@Override
	public BadgeDetectedStruct getbadgeDetected() {

		long timestamp = ((long) (System.currentTimeMillis())) * 1000000;
		return new BadgeDetectedStruct("2", timestamp);
	}

	@Override
	public void getbadgeDetected(ListenerbadgeDetected handler) {
		handler.onNewbadgeDetected(this.getbadgeDetected());

	}

	@Override
	public boolean isEventDriven() {
		// TODO Auto-generated method stub
		return true;
	}

}
