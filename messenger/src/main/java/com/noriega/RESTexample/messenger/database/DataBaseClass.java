package com.noriega.RESTexample.messenger.database;

import java.util.HashMap;
import java.util.Map;
import com.noriega.RESTexample.messenger.model.Message;
import com.noriega.RESTexample.messenger.model.Profile;


public class DataBaseClass {
	
	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<String, Profile> profiles = new HashMap<>();

	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
	

}


// Docker Devops
// Git
// Maven
// Jenkin
// Agile
// All this topics for the monday !!!!