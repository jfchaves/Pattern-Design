package net.avantica.demo;

import net.avantica.classes.Pizza;
import net.avantica.classes.PizzaStore;
import net.avantica.factory.SimplePizzaFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);

		Pizza pizza = store.orderPizza("cheese");
		printPizzaInfo(pizza);
		
		pizza = store.orderPizza("clam");
		printPizzaInfo(pizza);
		
		pizza = store.orderPizza("veggie");
		printPizzaInfo(pizza);

	}
	private static void printPizzaInfo(Pizza pizza) {
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}

}
