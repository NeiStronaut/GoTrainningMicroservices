package com.thiscounts.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepositoryJpa extends JpaRepository<Login, Long> {
	
}
