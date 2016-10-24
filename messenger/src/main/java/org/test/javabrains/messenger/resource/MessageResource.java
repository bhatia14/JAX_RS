package org.test.javabrains.messenger.resource;



import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.test.javabrains.messenger.model.Message;
import org.test.javabrains.messenger.service.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> getMessage(){
		return messageService.getAllMessages();
	}
	
	@Path("/{messageId}")
	@GET
	public Message getMessage(@PathParam("messageId") String messageId){
		System.out.println(messageId);
		return messageService.getMessage(Long.parseLong(messageId));
	}
	
	
	@POST
	public Message addMessage(Message message){
		//System.out.println(messageId);
		return messageService.addMessage(message);
	}
	
	@PUT
	@Path("/{messageId}")
	public Message updateMessage(@PathParam("messageId") long id, Message message){
		message.setId(id);
		return messageService.updateMessage(message);
		
	}
	
	@DELETE
	@Path("/{messageId}")
	public void deleteMessage(@PathParam("messageId") long id){
		
		messageService.removeMessage(id);
		
	}
	
	
	
}
