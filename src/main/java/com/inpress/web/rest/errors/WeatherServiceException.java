package com.inpress.web.rest.errors;

public class WeatherServiceException extends Exception{
    public WeatherServiceException(String message) {
        super(message);
    }

    public WeatherServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
