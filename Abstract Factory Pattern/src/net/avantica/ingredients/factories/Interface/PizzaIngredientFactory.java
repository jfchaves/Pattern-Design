package net.avantica.ingredients.factories.Interface;

import net.avantica.ingredients.factories.Cheese;
import net.avantica.ingredients.factories.Clams;
import net.avantica.ingredients.factories.Dough;
import net.avantica.ingredients.factories.Pepperoni;
import net.avantica.ingredients.factories.Sauce;
import net.avantica.ingredients.factories.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
}
