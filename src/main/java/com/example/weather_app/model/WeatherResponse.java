package com.example.weather_app.model;

import java.util.List;

public class WeatherResponse {

    private String name;
    private List<Weather> weather;
    private Main main;

    // Getters and Setters

    public static class Weather {
        private String description;

        // Getters and Setters
    }

    public static class Main {
        private double temp;

        // Getters and Setters
    }
}
