package com.inpress.client.dto;

import lombok.Data;

@Data
public class WeatherConditionDto {
    private String text;
    private String icon;
    private String code;
}
