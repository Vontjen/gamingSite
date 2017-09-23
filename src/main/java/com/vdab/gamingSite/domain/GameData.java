package com.vdab.gamingSite.domain;


import javax.persistence.*;
import java.util.List;

//todo implement Properties class
@Entity
public class GameData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @ManyToOne
    private User user;
    @ManyToOne
    private Game game;
    @OneToMany
    private List<Properties> propertiesList;

    public GameData() {
    }

    public GameData(User user, Game game) {
        this.user = user;
        this.game = game;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public List<Properties> getPropertiesList() {
        return propertiesList;
    }

    public void setPropertiesList(List<Properties> propertiesList) {
        this.propertiesList = propertiesList;
    }
}
