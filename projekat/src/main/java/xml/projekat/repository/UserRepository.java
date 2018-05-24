package xml.projekat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import xml.projekat.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	 User findByEmail(String email);

}
