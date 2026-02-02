package org.pogodynka.apiservice;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    private final RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private static final String API_URL =
            "https://api.open-meteo.com/v1/forecast?latitude=%s&longitude=%s&daily=temperature_2m_mean,cloud_cover_mean&current=apparent_temperature,relative_humidity_2m,temperature_2m,snowfall,rain,surface_pressure,cloud_cover,wind_speed_10m&timezone=auto&forecast_days=3";

    public WeatherData getWeather(String longitude, String latitude) {
        String url = String.format(API_URL, latitude, longitude);
        try {
            WeatherData weatherData = restTemplate.getForObject(url, WeatherData.class);
            if (weatherData == null) return null;
            return weatherData;
        } catch (Exception e) {
            return null;
        }
    }
}
