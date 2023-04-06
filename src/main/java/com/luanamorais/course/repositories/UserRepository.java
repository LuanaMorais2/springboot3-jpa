package com.luanamorais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanamorais.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
