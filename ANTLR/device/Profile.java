package fr.inria.arles.pankesh.mongoDB;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class Profile {

	@Id
	private ObjectId id;

	private String badgeID;
	private double pref;
	private String uom;

	public ObjectId getId() {
		return id;
	}

	public String getBadgeID() {
		return badgeID;
	}

	public double getPref() {
		return pref;
	}

	public String getUom() {
		return uom;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public void setBadgeID(String badgeID) {
		this.badgeID = badgeID;
	}

	public void setPref(double pref) {
		this.pref = pref;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

}
