package fr.inria.arles.pankesh.dslcompiler;

public class DeployementConstraint {

	private String softwareComponentName;
	private String attributeName;
	private String attributeValue;

	public DeployementConstraint() {
	}

	public DeployementConstraint(String softwareComponentName, String attributeName, String attributeValue) {
		super();
		this.softwareComponentName = softwareComponentName;
		this.attributeName = attributeName;
		this.attributeValue = attributeValue;

	}

	public String getSoftwareComponentName() {
		return softwareComponentName;
	}

	public void setSoftwareComponentName(String softwareComponentName) {
		this.softwareComponentName = softwareComponentName;

	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

}
