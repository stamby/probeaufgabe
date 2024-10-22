package weather;

import weather.repository.WeatherDataRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import weather.model.Weather;

// Comment the import below
import java.time.LocalDateTime;

@SpringBootApplication
public class WeatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // Comment the part below
    @Bean
    public CommandLineRunner initDatabase(WeatherDataRepository repository) {
        return args -> {
            // Load some test data into the database
            repository.save(new Weather("10°C", "Cloudy", "Salzburg", LocalDateTime.now()));
            repository.save(new Weather("12°C", "Rainy", "Vienna", LocalDateTime.now()));
        };
    }
}

