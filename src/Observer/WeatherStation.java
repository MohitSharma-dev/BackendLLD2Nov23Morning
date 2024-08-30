package Observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentStatsDisplay currentStatsDisplay = new CurrentStatsDisplay(weatherData);
        ForecastStatsDisplay forecastStatsDisplay = new ForecastStatsDisplay();
        weatherData.registerObserver(currentStatsDisplay);

        weatherData.setMeasurements(10.0F , 20.0F, 30.0F);
        weatherData.setMeasurements(10.0F , 21.0F, 30.0F);

        weatherData.removeObserver(currentStatsDisplay);
        weatherData.registerObserver(forecastStatsDisplay);
        weatherData.setMeasurements(10.0F , 20.0F, 30.0F);
    }
}
