package com.inpress.service;

import com.inpress.client.dto.WeatherDto;
import com.inpress.web.rest.errors.WeatherServiceException;
import org.springframework.stereotype.Service;

@Service
public interface WeatherService {
WeatherDto getCurrentWeather(String city) throws WeatherServiceException;

}
