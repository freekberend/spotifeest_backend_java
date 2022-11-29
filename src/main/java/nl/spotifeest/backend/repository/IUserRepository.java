package nl.spotifeest.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nl.spotifeest.backend.model.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
