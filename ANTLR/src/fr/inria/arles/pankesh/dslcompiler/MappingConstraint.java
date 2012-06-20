package fr.inria.arles.pankesh.dslcompiler;

import fr.inria.arles.pankesh.parser.antlr.Context;

public class MappingConstraint {

	private String softwareComponentName;
	private String attributeName;
	private String attributeValue;
	private DeployementConstraint deploymentConstraint;

	public MappingConstraint() {
	}

	public void addDeployementConstraintObj() {
		deploymentConstraint = new DeployementConstraint(
				getSoftwareComponentName(), getAttributeName(),
				getAttributeValue());

		Context.addDeploymentConstraints(deploymentConstraint);
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
