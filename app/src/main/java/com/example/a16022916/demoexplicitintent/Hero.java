package com.example.a16022916.demoexplicitintent;

import java.io.Serializable;

/**
 * Created by 16022916 on 30/4/2018.
 */

public class Hero implements Serializable {

    private String name;
    private int Strength, technicalProwess;

    public Hero(String name, int strength, int technicalProwess) {
        this.name = name;
        Strength = strength;
        this.technicalProwess = technicalProwess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getTechnicalProwess() {
        return technicalProwess;
    }

    public void setTechnicalProwess(int technicalProwess) {
        this.technicalProwess = technicalProwess;
    }
}
