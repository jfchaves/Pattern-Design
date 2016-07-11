package net.avantica.classes;

public class Memento {
	
	private String articulo;
	
	public Memento(String articuloNuevo) {
		articulo = articuloNuevo;
	}

	public String getArticuloGuardado() {
		return articulo;
	}

}
