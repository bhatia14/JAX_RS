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

import org.test.javabrains.messenger.model.Profile;
import org.test.javabrains.messenger.service.ProfileService;
import org.test.javabrains.messenger.service.ProfileService;

@Path("/profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResource {

ProfileService profileService = new ProfileService();
	
	@GET
	public List<Profile> getProfile(){
		return profileService.getAllProfiles();
	}
	
	@Path("/{profileName}")
	@GET
	public Profile getProfile(@PathParam("profileName") String profileName){
		System.out.println(profileName);
		return profileService.getProfile(profileName);
	}
	
	
	@POST
	public Profile addProfile(Profile profile){
		//System.out.println(profileId);
		return profileService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile){
		profile.setProfileName(profileName);
		return profileService.updateProfile(profile);
		
	}
	
	@DELETE
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName") String profileName){
		
		profileService.removeProfile(profileName);
		
	}
	
	
}
