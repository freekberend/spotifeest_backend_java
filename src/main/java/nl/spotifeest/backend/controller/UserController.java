package nl.spotifeest.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import nl.spotifeest.backend.model.User;
import nl.spotifeest.backend.repository.IUserRepository;


@CrossOrigin(maxAge = 3600)
@RestController
public class UserController {
	
	@Autowired
	private IUserRepository repo;
	
	@RequestMapping(value = "users")
	public List<User> users() {
		return repo.findAll();
	}

	@PostMapping("createuser")
	public void createUser(@RequestBody User user) {
		repo.save(user);
	}

}
