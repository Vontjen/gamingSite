package com.vdab.gamingSite.domain;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {
    @Id
    private String name;
    private boolean publisher;
    private boolean developer;

    public Company() {
    }

    public Company(String name, boolean publisher, boolean developer) {
        this.name = name;
        this.publisher = publisher;
        this.developer = developer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPublisher() {
        return publisher;
    }

    public void setPublisher(boolean publisher) {
        this.publisher = publisher;
    }

    public boolean isDeveloper() {
        return developer;
    }

    public void setDeveloper(boolean developer) {
        this.developer = developer;
    }
}
