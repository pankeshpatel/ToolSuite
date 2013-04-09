package fr.inria.arles.pankesh.semanticmodel;


public class Widget {

	public String textbox;
	public String button;
	public String textview;
	
	public Widget(String textbox, String button, String textview) {
		this.textbox = textbox;
		this.button = button;
		this.textview = textview;
	}

	public String getTextbox() {
		return textbox;
	}

	public void setTextbox(String textbox) {
		this.textbox = textbox;
	}

	public String getButton() {
		return button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public String getTextview() {
		return textview;
	}

	public void setTextview(String textview) {
		this.textview = textview;
	}
	
	
	
}
