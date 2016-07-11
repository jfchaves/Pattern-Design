package net.avantica.visitors;

import net.avantica.visitables.Liquor;
import net.avantica.visitables.Necessity;
import net.avantica.visitables.Tobacco;

public interface Visitor {
	public double visit(Liquor liquorItem);
	public double visit(Necessity necesityItem);
	public double visit(Tobacco tobaccoItem);

}
