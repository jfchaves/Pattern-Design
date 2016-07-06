package net.avantica.demo;

import net.avantica.observers.CurrentConditions;
import net.avantica.observers.ForecastDisplay;
import net.avantica.observers.StaticsDisplay;
import net.avantica.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData weatherData = new WeatherData();
		
		CurrentConditions currentDisplay = new CurrentConditions(weatherData);
		
		StaticsDisplay staticsDisplay = new StaticsDisplay(weatherData);
		ForecastDisplay forecast = new ForecastDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
