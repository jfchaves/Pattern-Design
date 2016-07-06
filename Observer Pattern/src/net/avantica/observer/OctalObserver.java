package net.avantica.observer;

public class OctalObserver extends Observer {

	private static final String DESC_OCTA = "Octal Convertion: ";
	
	public OctalObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println( DESC_OCTA + Integer.toOctalString( subject.getState() ) );
	}

}
