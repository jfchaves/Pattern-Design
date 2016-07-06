package net.avantica.clases;

public class AccountNumberCheck {
	private int accountNumer = 12345678;
	
	public int getAccountNumber(){
		return accountNumer;
	}
	
	public boolean accountActive(int acctNumToCheck){
		if(acctNumToCheck == getAccountNumber()){
			return true;
		}
		else{
			return false;
		}
	}

}
