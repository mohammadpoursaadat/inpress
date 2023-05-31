package com.inpress.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherCurrentDto {
    private WeatherConditionDto condition;
    @JsonProperty(value = "temp_c")
    private Float tempC;
    @JsonProperty(value = "temp_f")
    private Float tempF;
    @JsonProperty(value = "wind_mph")
    private Float windMph;
    @JsonProperty(value = "wind_kph")
    private Float windKph;
    @JsonProperty(value = "wind_degree")
    private Float windDegree;
    @JsonProperty(value = "wind_dir")
    private String windDir;
    private Float humidity;
    private Float cloud;


}
