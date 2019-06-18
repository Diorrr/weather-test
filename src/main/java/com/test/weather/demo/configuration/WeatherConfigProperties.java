package com.test.weather.demo.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "weather")
public class WeatherConfigProperties {

    private String baseUrl;

    private String currentUrl;

    private String key;

    private String cityUrl;
}
