package com.inpress.web.rest.controller;

import com.inpress.client.dto.WeatherDto;
import com.inpress.service.WeatherService;
import com.inpress.web.rest.errors.WeatherServiceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping("/current")
    public ResponseEntity<WeatherDto> getCurrentWeather(@RequestParam("city") String city) {
        try {
            WeatherDto weatherData = weatherService.getCurrentWeather(city);
            return ResponseEntity.ok(weatherData);
        } catch (WeatherServiceException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
