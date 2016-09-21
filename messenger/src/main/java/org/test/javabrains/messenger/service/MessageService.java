package org.test.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.test.javabrains.messenger.database.DatabaseClass;
import org.test.javabrains.messenger.model.Message;



public class MessageService {
	
	private Map<Long, Message> messages=DatabaseClass.getMessage();
	
	public MessageService(){
		messages.put(1L, new Message(1, "Hello world", "Test"));
		messages.put(2L, new Message(1, "Hello jersey", "Test"));
	}
	
	public Message getMessage(long id){
		return messages.get(id);
		
	}
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId()<=0)
			return null;
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(long id){
		return messages.remove(id);
	}
}
