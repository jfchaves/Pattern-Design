package net.avantica.ingredients.factories;

import net.avantica.ingredients.factories.Interface.PizzaIngredientFactory;
import net.avantica.ingredients.factories.cheese.ReggianoCheese;
import net.avantica.ingredients.factories.clams.FreshClams;
import net.avantica.ingredients.factories.dough.ThinCrustDough;
import net.avantica.ingredients.factories.pepperoni.SlicedPepperoni;
import net.avantica.ingredients.factories.sauce.MarinaraSauce;
import net.avantica.ingredients.factories.veggies.Garlic;
import net.avantica.ingredients.factories.veggies.Mushrooms;
import net.avantica.ingredients.factories.veggies.Onion;
import net.avantica.ingredients.factories.veggies.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushrooms(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
