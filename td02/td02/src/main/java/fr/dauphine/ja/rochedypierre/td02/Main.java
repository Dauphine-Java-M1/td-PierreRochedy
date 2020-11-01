package fr.dauphine.ja.rochedypierre.td02;

public class Main {
//	public static void main(String[] args) throws Exception {
//		Mere mere=new Mere();
//		Mere mereFille=new Fille();
//		Fille fille=new Fille();
//
//		fille.miage();
//		((Fille)mereFille).miage();	
//		mere.a();
//		mereFille.a();
//		fille.a();
//		((Mere)mereFille).a();
//		mereFille.b(null);
//		mereFille.c();
//		mereFille.c(mere);
//		mereFille.c(mereFille);	
//		mereFille.c(fille);
//		fille.c(fille);
//		
//		mere.d();
//		mereFille.d();
//		mere.printF();
//		mereFille.printF();
//		
//		mereFille.j();
//		mereFille.k();
//		mereFille.l();
//		mereFille.m();
//	}


	public static void main(String[] args) throws Exception {
		Expr val = new Value(1337.0);
		System.out.println(val.eval()); //affiche 1337.0
		
		Expr add = new Add(new Value(327.0), val);
		System.out.println(add.eval()); //affiche 1664.0
		
		Expr e = new Add(new Value(350.0), add);
		System.out.println(e.eval()); //affiche 2014.0
		
		Expr mult = new Mult(new Value(3.0), new Value (3.0));
		System.out.println(mult.eval());
		
		Expr m = new Mult(new Value(2.0), mult);
		System.out.println(m.eval());
		
		Expr sq = new Sqrt(mult);
		System.out.println(sq.eval());

		System.out.println(val.toString());
		System.out.println(add.toString());
		System.out.println(mult.toString());
	}
}
