package weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weather.model.Weather;
import weather.repository.WeatherDataRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WeatherService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WeatherDataRepository repository;

    public Weather fetchAndStoreWeatherData() {
        // Example weather API endpoint, replace with the correct one
        String url = "https://dwd.api.bund.dev/weather"; 
        
        // Fetch the weather data from the external API
        Weather response = restTemplate.getForObject(url, Weather.class);
        
        if (response != null) {
            // Set additional fields if necessary (e.g., timestamp)
            response.setTimestamp(LocalDateTime.now());

            // Save the weather data into the database
            repository.save(response);
        }

        return response;
    }

    public List<Weather> getAllWeatherData() {
        // Return all weather records from the database
        return repository.findAll();
    }
}

