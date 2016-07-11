package net.avantica.ingredients.factories;

import net.avantica.ingredients.factories.Interface.PizzaIngredientFactory;
import net.avantica.ingredients.factories.cheese.MozzarellaCheese;
import net.avantica.ingredients.factories.clams.FrozenClams;
import net.avantica.ingredients.factories.dough.ThickCrustDough;
import net.avantica.ingredients.factories.pepperoni.SlicedPepperoni;
import net.avantica.ingredients.factories.sauce.PlumTomatoSauce;
import net.avantica.ingredients.factories.veggies.BlackOlives;
import net.avantica.ingredients.factories.veggies.Eggplant;
import net.avantica.ingredients.factories.veggies.Spinach;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
