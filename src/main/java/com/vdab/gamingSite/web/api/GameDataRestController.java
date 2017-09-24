package com.vdab.gamingSite.web.api;

import com.vdab.gamingSite.domain.GameData;
import com.vdab.gamingSite.repo.GameDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/gamedata")
public class GameDataRestController {
    @Autowired
    private GameDataRepository gdr;

    @RequestMapping(method = RequestMethod.GET , path = "all", produces = "application/json")
    public List<GameData> getAll(){
        return gdr.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path="{id}", produces = "application/json")
    public GameData getById(@PathVariable("id") int id) {
        return gdr.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path="{id}")
    public void deleteById(@PathVariable("id") int id) {
        gdr.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public ResponseEntity<GameData> create(@RequestBody GameData input) {
        if(input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        gdr.save(input);
        return new ResponseEntity<>(input, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json", produces = "application/json")
    public ResponseEntity<GameData> update(@RequestBody GameData input) {
        if(input.getId() != null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        gdr.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }


}
