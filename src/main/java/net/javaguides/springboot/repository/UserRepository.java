package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
