package com.vdab.gamingSite.domain;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Properties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String propertyName;

    private String propertyValue;

    public Properties(String propertyName, String propertyValue) {
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

    public Properties() {
    }

    public int getId() {
        return id;
    }


    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getGetPropertyValue() {
        return propertyValue;
    }

    public void setGetPropertyValue(String getPropertyValue) {
        this.propertyValue = getPropertyValue;
    }
}
