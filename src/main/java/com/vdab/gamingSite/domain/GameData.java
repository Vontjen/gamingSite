//package com.vdab.gamingSite.domain;
//
//import org.springframework.context.annotation.Primary;
//
//import javax.persistence.*;
//import java.util.List;
//
////todo implement Properties class
//@Entity
//public class GameData {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    int id;
//
//    @OneToOne
//    private User user;
//    @OneToOne
//    private Game game;
//    @ElementCollection
//    private List<Properties> propertieslist;
//
//    public GameData(User user, Game game) {
//        this.user = user;
//        this.game = game;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Game getGame() {
//        return game;
//    }
//
//    public void setGame(Game game) {
//        this.game = game;
//    }
//
//    public List<Properties> getPropertieslist() {
//        return propertieslist;
//    }
//
//    public void setPropertieslist(List<Properties> propertieslist) {
//        this.propertieslist = propertieslist;
//    }
//}
