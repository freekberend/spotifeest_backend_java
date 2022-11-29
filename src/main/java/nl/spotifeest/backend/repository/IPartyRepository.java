package nl.spotifeest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nl.spotifeest.backend.model.Party;

public interface IPartyRepository extends JpaRepository<Party, Long>{

}
