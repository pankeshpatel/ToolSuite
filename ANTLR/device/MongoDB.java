package fr.inria.arles.pankesh.mongoDB;

import java.net.UnknownHostException;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

import framework.IProfileDB;
import framework.TempStruct;

public class MongoDB implements IProfileDB {

	@Override
	public void setprofile(String newIndex, TempStruct newprofileValue) {
		// connect to the local database server
		Mongo mongo;
		try {
			mongo = new Mongo();
			Morphia morphia = new Morphia();
			morphia.map(Profile.class);
			Datastore ds = morphia.createDatastore(mongo, "testDB");
			ds.ensureIndexes(); // creates indexes from @Index annotations in
								// your
								// entities
			ds.ensureCaps(); // creates capped collections from @Entity

			Profile profile = new Profile();
			profile.setBadgeID(newIndex);
			profile.setPref(newprofileValue.gettempValue());
			profile.setUom(newprofileValue.getunitOfMeasurement());

			// Save the POJO
			ds.save(profile);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public TempStruct getprofile(String index) {
		Mongo mongo;
		try {
			mongo = new Mongo();
			Morphia morphia = new Morphia();
			morphia.map(Profile.class);
			Datastore ds = morphia.createDatastore(mongo, "testDB");
			ds.ensureIndexes(); // creates indexes from @Index annotations in
								// your entities
			ds.ensureCaps(); // creates capped collections from @Entity

			Profile p = ds.find(Profile.class, "badgeID", index).get();

			return new TempStruct(p.getPref(), p.getUom());

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
