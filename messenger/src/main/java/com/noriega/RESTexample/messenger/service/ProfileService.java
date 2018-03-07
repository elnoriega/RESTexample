package com.noriega.RESTexample.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.noriega.RESTexample.messenger.database.*;
import com.noriega.RESTexample.messenger.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DataBaseClass.getProfiles();
	
	public ProfileService() {
		profiles.put("Noriega", new Profile(1l,"Juan ","Noriega","Hola"));
	}
	
	public List<Profile> getAllProfiles(){
		return new ArrayList<Profile>(profiles.values());
	}
	
	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}
	
	public Profile AddProfile(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile updateProfile(Profile profile) {
		if(profile.getProfileName().isEmpty()) {
			return null;
		}
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}
	
	public Profile removeProfile(String profileName) {
		return profiles.remove(profileName);
		}
}

