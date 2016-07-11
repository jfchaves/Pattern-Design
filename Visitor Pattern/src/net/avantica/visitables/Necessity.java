package net.avantica.visitables;

import net.avantica.visitors.Visitable;
import net.avantica.visitors.Visitor;

public class Necessity implements Visitable {

	private double price;

	public Necessity(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
