package net.avantica.behavior;

import net.avantica.context.Context;
import net.avantica.strategy.Add;
import net.avantica.strategy.Multiply;
import net.avantica.strategy.Substract;

public class StrategyDemo {
	
	private static final String DEMO_SUMA = "10 + 5 = ";
	private static final String DEMO_SUBSTRACT = "10 - 5 = ";
	private static final String DEMO_MULTIPLY = "10 * 5 = ";
	
	private static int numero1 = 10;
	private static int numero2 = 5;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Context context = new Context(new Add());
		System.out.println(DEMO_SUMA + context.excuteStrategy(numero1, numero2));
		
		context = new Context(new Substract());
		System.out.println(DEMO_SUBSTRACT + context.excuteStrategy(numero1, numero2));
		
		context = new Context(new Multiply());
		System.out.println(DEMO_MULTIPLY + context.excuteStrategy(numero1, numero2));
	}

}
