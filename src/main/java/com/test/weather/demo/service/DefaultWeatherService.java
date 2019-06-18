package com.test.weather.demo.service;

import com.google.gson.Gson;
import com.test.weather.demo.configuration.WeatherConfigProperties;
import com.test.weather.demo.dto.WeatherResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class DefaultWeatherService implements WeatherService {

    private final RestTemplate restTemplate;
    private final WeatherConfigProperties properties;

    public DefaultWeatherService(WeatherConfigProperties properties) {
        this.properties = properties;
        this.restTemplate = new RestTemplate();
    }

    @Override
    public WeatherResponseDto getWeatherCurrent(String cityName) {

        ResponseEntity<String> response =
                restTemplate.getForEntity(properties.getBaseUrl() + properties.getCurrentUrl() + properties.getKey() + properties.getCityUrl() + cityName, String.class);
        WeatherResponseDto responseDto = new Gson().fromJson(response.getBody(), WeatherResponseDto.class);
        log.info("Get data for city: {}", cityName);

        return responseDto;
    }
}
