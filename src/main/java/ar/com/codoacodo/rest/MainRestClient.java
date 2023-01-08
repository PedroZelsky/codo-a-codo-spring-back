package ar.com.codoacodo.rest;

import ar.com.codoacodo.resclient.impl.ReqRestServiceJerseyImpl;
import ar.com.codoacodo.restclient.ReqresRestService;
import ar.com.codoacodo.web.jerseyclient.Users;

public class MainRestClient {

	public static void main(String[] args) {

		ReqresRestService clientRest = new ReqRestServiceJerseyImpl("https://reqres.in/");

		ar.com.codoacodo.resclient.dto.Users users = clientRest.findUsers("2");
		
		System.out.println(users);
	}

}
