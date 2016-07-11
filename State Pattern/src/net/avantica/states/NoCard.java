package net.avantica.states;

import net.avantica.state.ATMMachine;

public class NoCard implements ATMState{
	ATMMachine atmMachine;

	public NoCard(ATMMachine newATMMachine) {

		atmMachine = newATMMachine;

	}

	@Override
	public void insertCard() {
		System.out.println("Tarjeta ingresada");
		atmMachine.setATMState(atmMachine.getYesCardState());
	}

	@Override
	public void ejectCard() {
		System.out.println("No ha insertado ninguna tarjeta aun");
	}

	@Override
	public void insertPin(int pintInserted) {
		System.out.println("Primero debe insertar una tarjeta");		
	}

	@Override
	public void requestCash(int cashRequested) {
		System.out.println("Primero debe insertar una tarjeta");
	}
}
