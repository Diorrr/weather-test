package com.test.weather.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherResponseDto {

    private WeatherLocationResponseDto location;

    private WeatherCurrentResponseDto current;
}
