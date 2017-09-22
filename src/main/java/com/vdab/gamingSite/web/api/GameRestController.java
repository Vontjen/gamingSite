package com.vdab.gamingSite.web.api;

import com.vdab.gamingSite.domain.Game;
import com.vdab.gamingSite.repo.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/game")
public class GameRestController {


    @Autowired
    private GameRepository gr;

    @RequestMapping(method = RequestMethod.GET , path = "all", produces = "application/json")
    public List<Game> getAll(){
        return gr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path="{id}", produces = "application/json")
    public Game getById(@PathVariable("id") int id) {
        return gr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path="{id}")
    public void deleteById(@PathVariable("id") int id) {
        gr.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Game> create(@RequestBody Game input) {
//        if(input.getId() != null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
        gr.save(input);
        return new ResponseEntity<>(input, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity<Game> update(@RequestBody Game input) {
//        if(input.getId() != null) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
        gr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }


}
