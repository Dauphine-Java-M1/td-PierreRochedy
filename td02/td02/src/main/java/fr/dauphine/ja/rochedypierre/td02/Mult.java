package fr.dauphine.ja.rochedypierre.td02;

public class Mult extends Expr{
	
	private Value val1;
	private Expr val2;

	public Mult(Value val1, Expr val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public double eval() {
		
		double t = super.getTotal() + val1.eval() * val2.getTotal();
		super.total = t;
		return t;
	}

	@Override
	public String toString() {
		return "Mult [val1=" + val1 + ", val2=" + val2 + "]";
	}
	

	
	

}
