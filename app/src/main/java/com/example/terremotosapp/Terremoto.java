package com.example.terremotosapp;

public class Terremoto {
    private String Magnitude;
    private  String Place;
    private String lon;
    private  String lat;

    public Terremoto(String magnitude, String place) {
        Magnitude = magnitude;
        Place = place;
    }

    public String getMagnitude() {
        return Magnitude;
    }

    public String getPlace() {
        return Place;
    }

    public String getLon() {
        return lon;
    }

    public String getLat() {
        return lat;
    }
}
