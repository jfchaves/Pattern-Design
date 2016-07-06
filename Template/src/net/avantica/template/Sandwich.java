package net.avantica.template;

public abstract class Sandwich {
	
	public void makeSandwich() {
		cortarPan();
		if (conVegetales()) {
			agregarVegetales();
		}
		if (conCarne()) {
			agregarCarne();
		}
		empacar();
	}

	public boolean conCarne() {
		return true;
	}

	public boolean conVegetales() {
		return true;
	}

	public abstract void agregarCarne();

	public abstract void agregarVegetales();

	void cortarPan() {
		System.out.println("Cortando pan...");
	}

	void empacar() {
		System.out.println("Sandwich empacado...\n");
	}

}
