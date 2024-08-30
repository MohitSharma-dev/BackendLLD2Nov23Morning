package Observer;

public class CurrentStatsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentStatsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
    }

    public void display(){
        System.out.print("Current Conditions : ");
        System.out.print(" Temperature: " + temperature);
        System.out.print(" Humidity: " + humidity);
        System.out.println(" Pressure: " + pressure);
    }

    void registerForUpdates(){
        weatherData.registerObserver(this);
    }
}
