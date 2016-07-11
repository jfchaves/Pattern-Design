package net.avantica.classes;

public class Originator {
	
	private String articulo;

	public void setArticulo(String articulo) {
		this.articulo = articulo;
	}
	
	public Memento storeInMemento(){
		System.out.println("Originator dice: Salvando nuevo Memento");
		return new Memento(articulo);
	}
	
	public String restoreFromMemento(Memento memento){
		articulo=memento.getArticuloGuardado();
		System.out.println("Originator dice: Recuperando ultimo Memento guardado:/n"+ articulo);
		return articulo;
	}

}
