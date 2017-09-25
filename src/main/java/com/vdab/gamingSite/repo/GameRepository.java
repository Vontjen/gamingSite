package com.vdab.gamingSite.repo;

import com.vdab.gamingSite.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Integer>{

    @Query("select g from Game g where g.developer.id = :id OR g.publisher.id = :id")
    public List<Game> getByCompany(@Param("id") int id);


}
