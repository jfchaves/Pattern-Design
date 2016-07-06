package net.avantica.condiments;

import net.avantica.decorators.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return .99;
	}
}
