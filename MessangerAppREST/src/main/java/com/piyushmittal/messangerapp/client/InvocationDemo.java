package com.piyushmittal.messangerapp.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class InvocationDemo {
	public static void main(String args[]){
		Invocation invocation = new InvocationDemo().prepareRequestForMessagePerYear(2016);
		Response response = invocation.invoke();
		System.out.println(response.getStatus());
		
	}
	
	public Invocation prepareRequestForMessagePerYear(int year){
		Client client = ClientBuilder.newClient();
		return client.target("http://localhost:8080/messangerapp/rest/")
				     .path("messages")
				     .queryParam("year",year)
				     .request(MediaType.APPLICATION_JSON)
				     .buildGet();
	}
}
