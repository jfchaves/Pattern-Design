package net.avantica.demo;

import net.avantica.clases.SandwichItaliano;
import net.avantica.clases.SandwichVegetariano;
import net.avantica.template.Sandwich;

public class Subway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sandwich sandwich1 = new SandwichItaliano();
		sandwich1.makeSandwich();
		Sandwich sandwich2 = new SandwichVegetariano();
		sandwich2.makeSandwich();
	}

}
