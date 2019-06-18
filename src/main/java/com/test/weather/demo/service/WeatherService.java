package com.test.weather.demo.service;

import com.test.weather.demo.dto.WeatherResponseDto;

public interface WeatherService {

    WeatherResponseDto getWeatherCurrent(String cityName);
}
