package Observer;

public class ForecastStatsDisplay implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void update() {

    }

    void display(){
        System.out.print("Forecast : ");
        System.out.print("Temperature : " + temperature);
        System.out.print("Humidity : " + humidity);
        System.out.println("Pressure : " + pressure);
    }


}
