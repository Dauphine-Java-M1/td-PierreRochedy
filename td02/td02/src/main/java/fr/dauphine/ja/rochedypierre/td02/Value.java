package fr.dauphine.ja.rochedypierre.td02;

public class Value extends Expr{


	public Value(double val) {
		super.total = val;
	}

	public double eval() {
		return super.total;
	}
	

	@Override
	public String toString() {
		return "Value [total=" + total + "]";
	}

	
	
	
}
