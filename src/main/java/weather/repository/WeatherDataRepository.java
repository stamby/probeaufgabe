package weather.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weather.model.Weather;

public interface WeatherDataRepository extends JpaRepository<Weather, Long> {
}
