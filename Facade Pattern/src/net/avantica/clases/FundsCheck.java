package net.avantica.clases;

public class FundsCheck {
	
	private double cashInAccount = 1000.00;
	
	public double getCashInAccount(){
		return cashInAccount;
	}
	
	public void decreaseCashInAccount(double cashWithdrawn){
		cashInAccount -= cashWithdrawn;
	}

	public void increaseCashInAccount(double cashDeposited){
		cashInAccount += cashDeposited;
	}
	
	public boolean haveEnoughMoney(double cashToWithDrawal){
		if(cashToWithDrawal > getCashInAccount()){
			System.out.println("Error: You don't have enough moeny");
			System.out.println("Current balance: " + getCashInAccount());
			
			return false;
		}
		else{
			decreaseCashInAccount(cashToWithDrawal);
			System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount());
			
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit){
		increaseCashInAccount(cashToDeposit);
		
		System.out.println("Deposit Complete: Current Balance is " + getCashInAccount());
	}
}
