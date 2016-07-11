package net.avantica.state;

import net.avantica.states.ATMState;
import net.avantica.states.HasCard;
import net.avantica.states.HasPin;
import net.avantica.states.NoCard;
import net.avantica.states.NoCash;

public class ATMMachine {
	ATMState hasCard;
	ATMState noCard;
	ATMState hasCorrectPin;
	public ATMState atmOutOfMoney;
	
	ATMState atmState;
	public int cashInMachine = 2000;
	public boolean correctPinEntered = false;
	
	public ATMMachine() {
		hasCard = new HasCard(this);
		noCard =  new NoCard(this);
		hasCorrectPin = new HasPin(this);
		atmOutOfMoney = new NoCash(this);
		
		atmState = noCard;
		if(cashInMachine <0){
			atmState = atmOutOfMoney;
		}
	}
	
	public void setATMState(ATMState newState){
		atmState = newState;
	}
	
	public void setCashInMachine(int newCash){
		cashInMachine = newCash;
	}
	
	public void insertCard(){
		atmState.insertCard();
	}
	public void ejectCard(){
		atmState.ejectCard();
	}
	public void insertPin(int pinInserted){
		atmState.insertPin(pinInserted);
	}
	public void requestCash(int cashRequested){
		atmState.requestCash(cashRequested);
	}
	
	public ATMState getYesCardState() { return hasCard; }
	public ATMState getNoCardState() { return noCard; }
	public ATMState getHasPin() { return hasCorrectPin; }
	public ATMState getNoCashState() { return atmOutOfMoney; }

}
