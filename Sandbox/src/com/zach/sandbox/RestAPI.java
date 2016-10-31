package com.zach.sandbox;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("RestAPI")
public class RestAPI {
	
	private String result;

	@GET
    @Produces(MediaType.TEXT_PLAIN)
	public String RestAPI() {
		
		setResult("Got It!");
		
		return getResult();
		
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
	
	

}
