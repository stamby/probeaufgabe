package weather.exception;

public class WeatherNotFoundException extends RuntimeException {
    
    public WeatherNotFoundException() {
        super("Could not find weather data for city");
    }
}

