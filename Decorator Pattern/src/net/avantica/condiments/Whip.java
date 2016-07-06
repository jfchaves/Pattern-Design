package net.avantica.condiments;

import net.avantica.decorators.Beverage;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}


	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
	
	public double cost(){
		return .10 + beverage.cost();
	}

}