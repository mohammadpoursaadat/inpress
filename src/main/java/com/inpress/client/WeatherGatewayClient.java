package com.inpress.client;

import com.inpress.client.dto.WeatherDto;
import com.inpress.client.dto.WeatherForecastDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "WEATHER-SERVICE", url = "http://api.weatherapi.com")
public interface WeatherGatewayClient {

    @GetMapping("/v1/current.json")
    WeatherDto getCurren(
        @RequestParam("q") String city,
        @RequestParam("key") String apiKey
    );


    @GetMapping("/v1/forecast.json")
    WeatherForecastDto getForecast(
        @RequestParam("q") String city,
        @RequestParam("key") String apiKey
    );
}

