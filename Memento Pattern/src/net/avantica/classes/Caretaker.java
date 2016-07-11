package net.avantica.classes;

import java.util.ArrayList;

public class Caretaker {
	
	private ArrayList<Memento> articulosGuardados= new ArrayList<>();
	
	public void addMemento(Memento newMemento){
		articulosGuardados.add(newMemento);
	}
	
	public Memento recuperarMemento(int index){
		return articulosGuardados.get(index);
	}

}
