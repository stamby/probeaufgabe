package weather.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String temperature;
    private String condition;
    private String city;
    private LocalDateTime timestamp;

    public Weather(String temperature, String condition, String city, LocalDateTime timestamp) {
        this.id = id;
        this.temperature = temperature;
        this.condition = condition;
        this.city = city;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public String getTemperature() {
        return temperature;
    }
    public String getCondition() {
        return condition;
    }
    public String getCity() {
        return city;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
