package com.test.weather.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherLocationResponseDto {

    private String name;

    private String country;
}
