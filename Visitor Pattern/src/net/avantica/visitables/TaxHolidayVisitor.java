package net.avantica.visitables;

import java.text.DecimalFormat;

import net.avantica.visitors.Visitor;

public class TaxHolidayVisitor implements Visitor {

	DecimalFormat df = new DecimalFormat("#.##");

	public TaxHolidayVisitor() {
	}

	public double visit(Liquor liquorItem) {
		System.out.println("Liquor Item: Price with Holiday Tax");
		return Double.parseDouble(df.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
	}

	public double visit(Tobacco tobaccoItem) {
		System.out.println("Tobacco Item: Price with Holiday Tax");
		return Double.parseDouble(df.format((tobaccoItem.getPrice() * .30) + tobaccoItem.getPrice()));
	}

	public double visit(Necessity necessityItem) {
		System.out.println("Necessity Item: Price with Holiday Tax");
		return Double.parseDouble(df.format(necessityItem.getPrice()));
	}

}
