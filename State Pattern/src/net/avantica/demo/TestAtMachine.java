package net.avantica.demo;

import net.avantica.state.ATMMachine;

public class TestAtMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMMachine atm = new ATMMachine();
		atm.insertCard();
		atm.insertPin(3333);
		atm.requestCash(3000);
		atm.insertCard();
		atm.insertPin(1234);
		atm.requestCash(1500);
		atm.insertPin(3333);
		atm.requestCash(3000);
		atm.ejectCard();
		atm.insertCard();
		atm.insertPin(1234);
		atm.requestCash(500);
		atm.insertCard();
		atm.insertPin(1234);

	}

}
