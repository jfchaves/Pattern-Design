package net.avantica.store;

import net.avantica.base.classes.Pizza;
import net.avantica.base.classes.PizzaStore;
import net.avantica.ingredients.factories.ChicagoPizzaIngredientFactory;
import net.avantica.ingredients.factories.Interface.PizzaIngredientFactory;
import net.avantica.pizzas.CheesePizza;
import net.avantica.pizzas.ClamPizza;
import net.avantica.pizzas.PepperoniPizza;
import net.avantica.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if (item.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		} else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		} else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}

		return pizza;
	}
}
