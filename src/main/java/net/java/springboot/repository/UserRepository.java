package net.java.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.java.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
