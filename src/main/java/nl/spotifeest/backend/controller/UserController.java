package nl.spotifeest.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import nl.spotifeest.backend.model.User;
import nl.spotifeest.backend.repository.IUserRepository;



@RestController
public class UserController {
	
	@Autowired
	private IUserRepository repo;
	
	@RequestMapping(value = "users")
	public List<User> users() {
		return repo.findAll();
	}

}
