package net.avantica.clases;

import net.avantica.template.Sandwich;

public class SandwichItaliano extends Sandwich {
	
	private String[] carnes = {"jamon","pepperoni"};
	private String[] vegetales = {"cebolla", "pepinillos","tomate"};

	@Override
	public void agregarCarne() {
		System.out.print("Agregando carnes: ");
		for(String s : carnes){
			System.out.print(s+" ");
		}
		System.out.print("\n");
	}

	@Override
	public void agregarVegetales() {
		System.out.print("Agregando vegetales: ");
		for(String vegetal : vegetales){
			System.out.print(vegetal+" ");
		}
		System.out.print("\n");
		
	}

}
