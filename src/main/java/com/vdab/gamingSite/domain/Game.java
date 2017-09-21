package com.vdab.gamingSite.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//todo implement lists as Classes
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, unique = true)
    private String name;
    @ElementCollection
    @Enumerated
    private List<Genres> genres = new ArrayList<>();
    //todo add Company class with bools for publisher and company
    //todo implement method to get all games from publisher/dev
    private String developer;
    private String publisher;
    @ElementCollection
    @Enumerated
    private List<Platforms> platforms = new ArrayList<>();
    @Lob
    @Column(name="PICTURE")
    private byte[] picture;

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    private Date releaseDate;

    public Game() {
    }

    //genres nuttig in constructor?
    public Game(String name, String developer, String publisher, Date releaseDate) {
        this.name = name;
        this.developer = developer;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
    }

    public List<Platforms> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platforms> platforms) {
        this.platforms = platforms;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {

        this.releaseDate = releaseDate;
    }

    public List<Genres> getGenres() {
        return genres;
    }

    public void setGenres(List<Genres> genres) {
        this.genres = genres;
    }
}
