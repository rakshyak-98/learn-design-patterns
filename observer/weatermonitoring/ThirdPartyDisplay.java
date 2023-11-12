package observer.weatermonitoring;

public class ThirdPartyDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ThirdPartyDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature; 
        this.humidity = humidity;
        display();
    }
    
}
