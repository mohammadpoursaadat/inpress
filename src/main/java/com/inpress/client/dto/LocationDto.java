package com.inpress.client.dto;

import lombok.Data;

@Data
public class LocationDto {
    private String name;
    private String region;
    private String country;
    private String lat;
    private String lon;
}
