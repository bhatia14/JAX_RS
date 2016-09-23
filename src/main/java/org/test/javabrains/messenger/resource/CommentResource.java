package org.test.javabrains.messenger.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class CommentResource {

	@GET
	public String test(){
		return "new sub resource";
	}
}
