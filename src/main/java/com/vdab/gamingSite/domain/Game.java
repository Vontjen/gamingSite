package com.vdab.gamingSite.domain;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
    //todo implement method to get all games from publisher/dev
    @OneToOne
    private Company developer;
    @OneToOne
    private Company publisher;
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
    public Game(String name, Company developer, Company publisher, Date releaseDate) {
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

    public Company getDeveloper() {
        return developer;
    }

    public void setDeveloper(Company developer) {
        this.developer = developer;
    }

    public Company getPublisher() {
        return publisher;
    }

    public void setPublisher(Company publisher) {
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
