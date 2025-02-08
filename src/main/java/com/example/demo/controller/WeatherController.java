package com.example.demo.controller;

import com.example.demo.model.WeatherResponse;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/zipcode/{zipCode}")
    public ResponseEntity<?> getWeatherByZipCode(@PathVariable String zipCode) {
        try {
            WeatherResponse weather = weatherService.getWeatherByZipCode(zipCode);
            return ResponseEntity.ok(weather);
        } catch (HttpClientErrorException.NotFound e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity
                .badRequest()
                .body("Error fetching weather data: " + e.getMessage());
        }
    }
}