package net.avantica.states;

import net.avantica.state.ATMMachine;

public class NoCash implements ATMState{
	ATMMachine atmMachine;

	public NoCash(ATMMachine newATMMachine) {
		atmMachine = newATMMachine;
	}

	@Override
	public void insertCard() {
		System.out.println("Tarjeta Rechazada. No hay efectivo en el cajero.");
	}

	@Override
	public void ejectCard() {
		System.out.println("No ha insertado su tarjeta. No hay efecivo en el cajero");
	}

	@Override
	public void insertPin(int pintInserted) {
		System.out.println("No ha insertado su tarjeta. No hay efecivo en el cajero");
	}

	@Override
	public void requestCash(int cashRequested) {
		System.out.println("No ha insertado su tarjeta. No hay efecivo en el cajero");
	}

}
