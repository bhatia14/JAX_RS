package org.test.javabrains.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.test.javabrains.messenger.model.Message;
import org.test.javabrains.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messages= new HashMap<>();
			
	private static Map<String, Profile> profiles= new HashMap<>();

	
	public static Map<Long, Message> getMessage(){
		return messages;
	}
	public static Map<String, Profile> getprofiles(){
		return profiles;
	}
}