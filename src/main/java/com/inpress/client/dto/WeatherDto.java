package com.inpress.client.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherDto {

    private LocationDto location;
    private WeatherConditionDto current;
}
