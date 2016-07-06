package net.avantica.subject;

import java.util.ArrayList;
import java.util.List;

import net.avantica.observers.Observer;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {

		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {

		if (observers.contains(o)) {
			observers.remove(o);
		}

	}

	public void notifyObservers() {

		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}

	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
