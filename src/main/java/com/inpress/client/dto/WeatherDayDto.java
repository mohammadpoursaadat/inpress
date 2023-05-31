package com.inpress.client.dto;

import java.util.List;

public class WeatherDayDto {

    private Float maxTempF;
    private Float maxTempC;
    private Float minTempF;
    private Float minTempC;
    private Float avgTempF;
    private Float avgTempC;
    private Float maxWindMph;
    private Float maxWindKph;
    private Float minWindMph;
    private Float minWindKph;
    private WeatherConditionDto weatherCondition;
    private List<WeatherHourDto> hours;
}
