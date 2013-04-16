package fr.inria.arles.pankesh.semanticmodel;

public class PrimitiveType extends DataType {

	public static final String[] primitiveTypes = { "integer", "boolean", "String", "float" };

	public PrimitiveType(String name) {
		super(name);

	}

	public static String[] getPrimitivetypes() {
		return primitiveTypes;
	}

}
