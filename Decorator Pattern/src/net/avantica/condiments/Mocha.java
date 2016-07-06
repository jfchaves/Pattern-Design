package net.avantica.condiments;

import net.avantica.decorators.Beverage;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
	
	public double cost(){
		return .20 + beverage.cost();
	}

}
