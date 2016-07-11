package net.avantica.states;

import net.avantica.state.ATMMachine;

public class HasCard implements ATMState {
	ATMMachine atmMachine;

	public HasCard(ATMMachine newATMMachine) {

		atmMachine = newATMMachine;

	}

	@Override
	public void insertCard() {
		System.out.println("No puede ingresar mas de una tarjeta");
	}

	@Override
	public void ejectCard() {
		System.out.println("Tarjeta expulsada");
		atmMachine.setATMState(atmMachine.getNoCardState());

	}

	@Override
	public void insertPin(int pintInserted) {
		if(pintInserted==1234){
			System.out.println("Pin correcto");
			atmMachine.correctPinEntered=true;
			atmMachine.setATMState(atmMachine.getHasPin());
		}else{
			System.out.println("Pin incorrecto");
			atmMachine.correctPinEntered=false;
			ejectCard();
		}	
	}

	@Override
	public void requestCash(int cashRequested) {
		System.out.println("Primero debe ingresar el pin");
	}
}
