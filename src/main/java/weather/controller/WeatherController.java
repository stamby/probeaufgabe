package weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import weather.model.Weather;
import weather.service.WeatherService;
import weather.exception.WeatherNotFoundException;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/import")
    public ResponseEntity<String> importWeatherData() {
        weatherService.fetchAndStoreWeatherData();
        return ResponseEntity.ok("Weather data imported from the feed.");
    }

    @GetMapping("/get")
    public List<Weather> getAllWeatherData() { // Change to use Weather
        return weatherService.getAllWeatherData();
    }
}
