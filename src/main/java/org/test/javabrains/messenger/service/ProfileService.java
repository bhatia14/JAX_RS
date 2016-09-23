package org.test.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.test.javabrains.messenger.database.DatabaseClass;
import org.test.javabrains.messenger.model.Profile;

public class ProfileService {
private Map<String, Profile> profiles=DatabaseClass.getprofiles();
	
	public ProfileService(){
		profiles.put("rachit", new Profile(1L, "Rachit", "Bhatia", "Test"));
		profiles.put("james", new Profile(2L, "James", "Bond", "Test"));
	}
	
	public Profile getProfile(String profileName){
		return profiles.get(profileName);
		
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile addProfile(Profile profile){
		profile.setId(profiles.size()+1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile){
		if(profile.getProfileName().isEmpty())
			return null;
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile removeProfile(String profileName){
		return profiles.remove(profileName);
	}

}
