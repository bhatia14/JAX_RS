package org.test.javabrains.messenger.model;

import java.util.Date;

public class Profile {
	private long id;
	private String profileName;
	private String firstName;
	private Date created;
	private String LastName;
	public Profile(){
		
	}
	
	public Profile(long id, String profileName, String firstName, String lastName){
		this.id=id;
		this.profileName=profileName;
		this.firstName=firstName;
		this.LastName=lastName;
		this.created=new Date();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProfileName() {
		return profileName;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
}
