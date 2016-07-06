package net.avantica.observer;

public class BinaryObserver extends Observer {
	
	private static final String DESC_BIN = "Binary Convertion: ";
	
	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( DESC_BIN + Integer.toBinaryString( subject.getState() ) ); 
	}

}
