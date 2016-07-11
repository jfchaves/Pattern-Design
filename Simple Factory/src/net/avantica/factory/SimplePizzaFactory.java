package net.avantica.factory;

import net.avantica.classes.CheesePizza;
import net.avantica.classes.ClamPizza;
import net.avantica.classes.PepperoniPizza;
import net.avantica.classes.Pizza;
import net.avantica.classes.VeggiePizza;

public class SimplePizzaFactory {
	
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

}
