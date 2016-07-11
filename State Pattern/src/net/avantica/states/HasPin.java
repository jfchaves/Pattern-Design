package net.avantica.states;

import net.avantica.state.ATMMachine;

public class HasPin implements ATMState{

	ATMMachine atmMachine;

	public HasPin(ATMMachine newATMMachine) {

		atmMachine = newATMMachine;

	}
	@Override
	public void insertCard() {
		System.out.println("No puede ingresar mas de una tarjeta");
	}

	@Override
	public void ejectCard() {
		System.out.println("Tarjeta Expulsada");
		atmMachine.setATMState(atmMachine.getNoCardState());
	}

	@Override
	public void insertPin(int pintInserted) {
		System.out.println("El pin ya fue insertado anteriormente");
		
	}

	@Override
	public void requestCash(int cashRequested) {
		if(cashRequested> atmMachine.cashInMachine){
			System.out.println("No hay sufiente efectivo disponible");
			ejectCard();
		}else{
			System.out.println("Efectivo entregado: "+cashRequested);
			atmMachine.setCashInMachine(atmMachine.cashInMachine-cashRequested);
			ejectCard();
			if(atmMachine.cashInMachine<=0){
				atmMachine.setATMState(atmMachine.atmOutOfMoney);
			}
			
		}
	}
}
