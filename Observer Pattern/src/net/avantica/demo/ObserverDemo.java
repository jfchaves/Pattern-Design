package net.avantica.demo;

import net.avantica.observer.BinaryObserver;
import net.avantica.observer.HexaObserver;
import net.avantica.observer.OctalObserver;
import net.avantica.observer.Subject;

public class ObserverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);
	
	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	}

}
