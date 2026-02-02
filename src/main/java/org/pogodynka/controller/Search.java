package org.pogodynka.controller;

public class Search {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            this.city = null;
            return;
        }
        this.city = city.trim();
    }
}
