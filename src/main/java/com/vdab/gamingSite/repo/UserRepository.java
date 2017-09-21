package com.vdab.gamingSite.repo;

import com.vdab.gamingSite.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
}

