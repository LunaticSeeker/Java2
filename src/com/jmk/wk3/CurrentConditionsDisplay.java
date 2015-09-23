package com.jmk.wk3;

public class CurrentConditionsDisplay implements Observer {
  private Subject weatherData;
  float temperature;
  float humidity;
  float pressure;
  
  public CurrentConditionsDisplay(Subject weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }
  
  public void update(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
  
  public void display() {
    System.out.println("temperature = " + temperature + ", humidity = " + humidity 
    + ", pressure = " + pressure);
  }
  
}