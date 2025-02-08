package com.example.demo.model;

import lombok.Data;

@Data
public class WeatherResponse {
    private Location location;
    private Current current;

    @Data
    public static class Location {
        private String name;
        private String region;
        private String country;
        private double lat;
        private double lon;
        private String localtime;
    }

    @Data
    public static class Current {
        private double temp_c;
        private double temp_f;
        private Condition condition;
        private double wind_mph;
        private double wind_kph;
        private String wind_dir;
        private double pressure_mb;
        private double precip_mm;
        private int humidity;
        private int cloud;
        private double feelslike_c;
        private double feelslike_f;
        private double vis_km;
        private double uv;
    }

    @Data
    public static class Condition {
        private String text;
        private String icon;
    }
}