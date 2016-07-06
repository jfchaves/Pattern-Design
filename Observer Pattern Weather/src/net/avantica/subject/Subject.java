package net.avantica.subject;

import net.avantica.observers.Observer;

public interface Subject {

	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	
}
