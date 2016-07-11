package net.avantica.base.classes;

import net.avantica.ingredients.factories.Cheese;
import net.avantica.ingredients.factories.Clams;
import net.avantica.ingredients.factories.Dough;
import net.avantica.ingredients.factories.Pepperoni;
import net.avantica.ingredients.factories.Sauce;
import net.avantica.ingredients.factories.Veggies;

public abstract class Pizza {
	protected String name;
	// parts of the pizza
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clams clam;

	protected abstract void prepare();

	protected void bake() {
		System.out.println("Bake for 25 minuts at 350");
	}

	protected void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	protected void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// must refactor this method
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("--- " + name + " ---\n");
		if (dough != null) {
			result.append(dough);
			result.append("\n");
		}
		if (sauce != null) {
			result.append(sauce);
			result.append("\n");
		}
		if (cheese != null) {
			result.append(cheese);
			result.append("\n");
		}
		if (veggies != null) {
			for (int i = 0; i < veggies.length; i++) {
				result.append(veggies[i]);
				if (i < veggies.length - 1) {
					result.append(", ");
				}
			}
			result.append("\n");
		}
		if (clam != null) {
			result.append(clam);
			result.append("\n");
		}
		if (pepperoni != null) {
			result.append(pepperoni);
			result.append("\n");
		}
		return result.toString();
	}
}
