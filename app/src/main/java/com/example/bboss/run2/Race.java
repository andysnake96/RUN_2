package com.example.bboss.run2;

import java.time.LocalDate;
import java.util.Random;

/**
 * Created by BBOSS on 05/07/2018.
 */

public class Race {
    private int id_race;


    private String name;
    private String description;
    private String locality;
    private LocalDate dateRace;
    private LocalDate prenExspire;
    private String urlRace;
    private String urlImage;
    private String note;
    private int n_max_runner;
    private float distance;

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getId_race() {
        return id_race;
    }

    public void setId_race(int id_race) {
        this.id_race = id_race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public LocalDate getDateRace() {
        return dateRace;
    }

    public void setDateRace(LocalDate dateRace) {
        this.dateRace = dateRace;
    }

    public LocalDate getPrenExspire() {
        return prenExspire;
    }

    public void setPrenExspire(LocalDate prenExspire) {
        this.prenExspire = prenExspire;
    }

    public String getUrlRace() {
        return urlRace;
    }

    public void setUrlRace(String urlRace) {
        this.urlRace = urlRace;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getN_max_runner() {
        return n_max_runner;
    }

    public void setN_max_runner(int n_max_runner) {
        this.n_max_runner = n_max_runner;
    }

    public Race() {
        Random random = new Random();
        name = String.valueOf(random.nextInt());
        locality = "ROMA!";
        dateRace = LocalDate.now().plusDays(random.nextInt()%5);
        distance= random.nextFloat();
    }
}
