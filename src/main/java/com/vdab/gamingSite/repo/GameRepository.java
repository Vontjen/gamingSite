package com.vdab.gamingSite.repo;

import com.vdab.gamingSite.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Integer>{
}
