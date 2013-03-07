package fr.inria.arles.pankesh.pubsubmiddleware;

import fr.inria.arles.pankesh.semanticmodel.Device;

public interface Subscriber {

	public abstract void notifyReceived(String eventName, Object arg,
			Device deviceInfo);
}