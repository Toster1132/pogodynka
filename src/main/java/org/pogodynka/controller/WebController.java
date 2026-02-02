package org.pogodynka.controller;

import org.pogodynka.apiservice.LonLatData;
import org.pogodynka.apiservice.LonLatService;
import org.pogodynka.apiservice.WeatherData;
import org.pogodynka.apiservice.WeatherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class WebController {
    private final LonLatService lonLatService;
    private final WeatherService weatherService;

    public WebController(LonLatService lonLatService, WeatherService weatherService) {
        this.lonLatService = lonLatService;
        this.weatherService = weatherService;
    }

    @GetMapping("*")
    public String weatherApp(@ModelAttribute("search") Search search, Model model) {
        if (search.getCity() == null || search.getCity().isEmpty()) return "home";

        LonLatData lonLat = lonLatService.getLonLat(search.getCity());
        if (lonLat == null) return "home";

        WeatherData weatherData = weatherService.getWeather(lonLat.getLon(), lonLat.getLat());
        if (weatherData == null) return "home";
        model.addAttribute("lonlat", lonLat);
        model.addAttribute("weatherData", weatherData);

        return "home";
    }
}
