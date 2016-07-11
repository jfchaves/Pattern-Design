package net.avantica.demo;

import net.avantica.visitables.Liquor;
import net.avantica.visitables.Necessity;
import net.avantica.visitables.TaxHolidayVisitor;
import net.avantica.visitables.TaxVisitor;
import net.avantica.visitables.Tobacco;
import net.avantica.visitors.Visitable;

public class VisitorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TaxVisitor taxCalc = new TaxVisitor();
		TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
		
		Visitable milk = new Necessity(3.47);
		Visitable vodka = new Liquor(11.99);
		Visitable cigars = new Tobacco(19.99);
		
		System.out.println(milk.accept(taxCalc) + "\n");
		System.out.println(vodka.accept(taxCalc) + "\n");
		System.out.println(cigars.accept(taxCalc) + "\n");
		
		System.out.println("TAX HOLIDAY PRICES\n");

		System.out.println(milk.accept(taxHolidayCalc) + "\n");
		System.out.println(vodka.accept(taxHolidayCalc) + "\n");
		System.out.println(cigars.accept(taxHolidayCalc) + "\n");
	}

}
