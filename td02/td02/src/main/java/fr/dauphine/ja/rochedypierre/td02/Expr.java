package fr.dauphine.ja.rochedypierre.td02;

public class Expr {
	
	public double total;

	public double eval() {
		return total;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Expr [total=" + total + "]";
	}
	
	
	
	
	
}
