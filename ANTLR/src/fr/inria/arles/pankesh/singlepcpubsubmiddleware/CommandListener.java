package fr.inria.arles.pankesh.singlepcpubsubmiddleware;

import fr.inria.arles.pankesh.semanticmodel.Device;

public interface CommandListener {
	public Object commandReceived(String methodName, Object arg,
			Device deviceInfo);
}
