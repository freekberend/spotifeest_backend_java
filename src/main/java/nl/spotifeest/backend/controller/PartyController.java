package nl.spotifeest.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.spotifeest.backend.model.Party;
import nl.spotifeest.backend.repository.IPartyRepository;


@CrossOrigin(maxAge = 3600)
@RestController
public class PartyController {

	@Autowired
	private IPartyRepository repo;
	
	@GetMapping("parties")
	public List<Party> parties(){
		return repo.findAll();
	}
	
	@PostMapping("createparty")
	public void createParty(@RequestBody Party party) {
		repo.save(party);
	}
}
