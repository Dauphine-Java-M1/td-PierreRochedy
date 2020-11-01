package fr.dauphine.ja.rochedypierre.td02;

public class Sqrt extends Expr{
	
	private Expr ex;


	public Sqrt(Expr val1) {
		super();
		this.ex = val1;
	}

	public double eval() {
		
		double t = super.getTotal() + Math.sqrt(ex.getTotal());
		return t;
	}



}
