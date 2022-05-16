package com.tiago.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiago.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
