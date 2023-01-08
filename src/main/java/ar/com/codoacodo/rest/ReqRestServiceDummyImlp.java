package ar.com.codoacodo.rest;

import ar.com.codoacodo.resclient.dto.User;
import ar.com.codoacodo.resclient.dto.Users;
import ar.com.codoacodo.restclient.ReqresRestService;

public class ReqRestServiceDummyImlp implements ReqresRestService {

	@Override
	public Users findUsers() {
		
		return new Users;
	}

	@Override
	public Users findUsers(String page) {
		return new Users;
	}

	@Override
	public User getUser(Integer userId) {
		return new User;
	}

}
