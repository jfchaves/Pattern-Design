package net.avantica.clases;

import net.avantica.template.Sandwich;

public class SandwichVegetariano extends Sandwich{
	private String[] vegetales = { "cebolla", "pepinillos", "tomate", "lechuga","albahaca","aceitunas"};

	@Override
	public void agregarCarne() {
	}

	@Override
	public void agregarVegetales() {
		System.out.print("Agregando vegetales: ");
		for(String vegetal : vegetales){
			System.out.print(vegetal+" ");
		}
		System.out.print("\n");
	}

	@Override
	public boolean conCarne() {
		return false;
	}

}
