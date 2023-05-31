package com.inpress.service;

import com.inpress.client.WeatherGatewayClient;
import com.inpress.client.dto.WeatherDto;
import com.inpress.web.rest.errors.WeatherServiceException;
import feign.FeignException;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImp implements WeatherService {
    private final WeatherGatewayClient weatherGatewayClient;
    private static final String API_KEY = "ea2b8ccfdb584311a91180346232605";

    public WeatherServiceImp(WeatherGatewayClient weatherGatewayClient) {
        this.weatherGatewayClient = weatherGatewayClient;
    }

    @Override
    public WeatherDto getCurrentWeather(String city) throws WeatherServiceException {
        try {
            return weatherGatewayClient.getCurren(city, API_KEY);
        } catch (FeignException e) {
            throw new WeatherServiceException("Failed to fetch current weather data", e);
        }
    }
}
