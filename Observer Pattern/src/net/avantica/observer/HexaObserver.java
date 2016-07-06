package net.avantica.observer;

public class HexaObserver extends Observer {

	private static final String DESC_HEXA = "Hexa Convertion: ";
	
	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( DESC_HEXA + Integer.toHexString( subject.getState() ) ); 
	}
	
	

}
