package fr.inria.arles.pankesh.common;

import java.util.ArrayList;
import java.util.List;

import util.DSConvert;
import util.RegionID;
import util.RegionLabel;

public class RegionSubscription {

	public static List<String> getSubscriptionString(String partitionAttrVal,
			List<String> regionLabelArray) {

		List<String> regionLabel = new ArrayList<String>();

		int i = HierarchicalRegion.getPartitionIndex(partitionAttrVal,
				regionLabelArray);

		for (int j = 0; j < regionLabelArray.size(); j++) {

			if (j <= i) {
				regionLabel.add(regionLabelArray.get(j));

			} else {
				regionLabel.add("any");
			}

		}

		return regionLabel;

	}

	public static RegionID getSubscriptionRequest(String partitionAttrVal,
			RegionLabel regionLabel, RegionID regionID) {

		List<String> regionIDsList = new ArrayList<String>();

		// Get all RegionLabel
		List<String> regionLabels = regionLabel.getAllRegionLabel();

		// Get all RegionIDs
		List<String> regionIDs = regionID.getAllRegionIDs();

		// get SubscriprionString
		List<String> subscriptionRegionLabels = getSubscriptionString(
				partitionAttrVal, regionLabels);

		for (int i = 0; i < subscriptionRegionLabels.size(); i++) {

			if (!subscriptionRegionLabels.get(i).equals("any")) {
				regionIDsList.add(regionIDs.get(i));
			} else {
				regionIDsList.add("*");
			}

		}

		return DSConvert.convertListToObj(regionIDsList);

	}

}
