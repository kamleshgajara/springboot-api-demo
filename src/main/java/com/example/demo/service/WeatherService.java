package com.example.demo.service;

import com.example.demo.model.WeatherResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.base-url}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    public WeatherService() {
        this.restTemplate = new RestTemplate();
    }

    public WeatherResponse getWeatherByZipCode(String zipCode) {
        String url = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .path("/current.json")
                .queryParam("key", apiKey)
                .queryParam("q", zipCode)
                .build()
                .toUriString();

        return restTemplate.getForObject(url, WeatherResponse.class);
    }
}