package net.avantica.context;

import net.avantica.strategy.Strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	public int excuteStrategy(int numero_1, int numero_2){
		return strategy.operation(numero_1, numero_2);
	}
}
