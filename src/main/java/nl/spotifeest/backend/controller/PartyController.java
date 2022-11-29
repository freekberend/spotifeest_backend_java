package nl.spotifeest.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nl.spotifeest.backend.model.Party;
import nl.spotifeest.backend.repository.IPartyRepository;



@RestController
public class PartyController {

	@Autowired
	private IPartyRepository repo;
	
	@GetMapping("parties")
	public List<Party> parties(){
		return repo.findAll();
	}
}
