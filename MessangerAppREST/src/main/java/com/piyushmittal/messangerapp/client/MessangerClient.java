package com.piyushmittal.messangerapp.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.piyushmittal.messangerapp.model.Message;



public class MessangerClient {
	
	public static void main(String args[] ){
		Client client = ClientBuilder.newClient();
		WebTarget baseTarget = client.target("http://localhost:8080/messangerapp/rest/");
		WebTarget messageTarget = baseTarget.path("messages");
		WebTarget singleMessageTarget = messageTarget.path("{messageId}");
		
		Message message = singleMessageTarget.resolveTemplate("messageId", "1")
				          .request(MediaType.APPLICATION_JSON)
				          .get(Message.class);
		
		
		System.out.println(message.getMessage());
		
		//POST Request
		message = new Message(3,"POST using REST Client", "Piyush");
		Response postResponse = messageTarget
				   .request()
				   .post(Entity.json(message));
		Message createdMessage = postResponse.readEntity(Message.class);
		System.out.println(message.getMessage());
	
		
	}

}
