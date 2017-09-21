package com.vdab.gamingSite.web.api;

import com.vdab.gamingSite.domain.User;
import com.vdab.gamingSite.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserRestController {

    @Autowired
    UserRepository ur;

    @RequestMapping(method = RequestMethod.GET , path = "all", produces = "application/json")
    public List<User> allUsers(){
        return ur.findAll();
    }

}
