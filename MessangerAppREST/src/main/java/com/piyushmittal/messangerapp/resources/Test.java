package com.piyushmittal.messangerapp.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.piyushmittal.messangerapp.model.Message;
import com.piyushmittal.messangerapp.services.MessageService;

@Path("/test")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Test {
	
	MessageService messageService = new MessageService();
	
	@GET
	public List<Message> print(){
		return messageService.getAllMessages();
	}

}
