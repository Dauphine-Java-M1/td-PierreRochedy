package fr.dauphine.ja.rochedypierre.shapes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class BrokenLign {

	//private Point[] brLign;
	private int nbMax;
	private LinkedList<Point> brLign = new LinkedList<Point>(); 
	

//	public BrokenLign(Point[] brLign, int nbMax) {
//		
//		if(brLign.length>nbMax)
//			throw new IllegalArgumentException("Tab plus grand que nb max de Point");
//			
//		this.brLign = brLign;
//		this.nbMax = nbMax;
//		
//	}
	
	public BrokenLign(int nbMax, LinkedList<Point> brLign) {
		
		if(brLign.size()>nbMax)
			throw new IllegalArgumentException("Tab plus grand que nb max de Point");
			
		this.nbMax = nbMax;
		this.brLign = brLign;
	}

//	public void add(Point p) {
//		
//		if(brLign.length + 1 <= nbMax) {
//			
//			brLign = Arrays.copyOf(brLign, brLign.length + 1);
//			brLign[brLign.length - 1] = p;
//		}
//		else
//			throw new IllegalArgumentException("Le point ne peut pas être ajouté car la capacité maximale a été atteinte");
//	}
	
	public void add(Point p) {
		if(brLign.size()+1>nbMax)
			throw new IllegalArgumentException("Le point ne peut pas être ajouté car la capacité maximale a été atteinte");
		brLign.add(p);
	}
	
	
	public int pointCapactity() {
		
		return nbMax;
	}
	
//	public int nbPoints() {
//		
//		return brLign.length;
//	}
	
	public int nbPoints() {
		
		return brLign.size();
	}
	
	public boolean contains(Point a) {
		
		for(Point point : brLign) {
			if(point.equals(a))
				return true;
	   }
	   return false;
	}
	
//	@Override
//	public String toString() {
//		return "BrokenLign [brLign=" + Arrays.toString(brLign) + ", nbMax=" + nbMax + "]";
//	}
	
	@Override
	public String toString() {
		return "BrokenLign [nbMax=" + nbMax + ", brLign=" + brLign + "]";
	}

	public static void main(String[] args) {

		Point p=new Point(1,2);
		Point p2=new Point(1,2);
		Point p3=new Point(2,2);
		Point p4=new Point(3,2);
		
		//Point[] brLign = new Point[] {p,p2};
		LinkedList<Point> brLign = new LinkedList<Point>(); 
		brLign.add(p);
		brLign.add(p2);
		
		BrokenLign b=new BrokenLign(3,brLign);
		
		System.out.println(b);
		b.add(p3);
		System.out.println(b);
		
		System.out.println(b.pointCapactity());
		System.out.println(b.nbPoints());
		System.out.println(b.contains(p4));

	}



	
}
