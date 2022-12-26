package ar.com.codoacodo.rest;

import ar.com.codoacodo.web.jerseyclient.User;
import ar.com.codoacodo.web.jerseyclient.Users;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class MainRestUsers {

	public static void main(String[] args) {
		
		
		//Instancio un cliente
		Client client = ClientBuilder.newClient();			
		
		//Defino el target
		WebTarget webTarget = client.target("https://reqres.in")
				.path("/api/users")
				.queryParam("page=2");
		
		//Construyo peticion
		Invocation.Builder invocation = webTarget.request(MediaType.APPLICATION_JSON);
		
		//Especifico metodo
		Response response = invocation.get();
		
		//Leo respuesta
		Users users = response.readEntity(Users.class);
		
		System.out.println(users);
	}
}
