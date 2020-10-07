package fr.dauphine.ja.rochedypierre.shapes;

import java.util.ArrayList;

public class Point {

	private int x;
	private int y;
	private static int cpt = 0;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		cpt++;
	}
	
	public Point(Point p) {
		super();
		this.x = p.getX();
		this.y = p.getY();
		cpt++;
	}
	
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public static void main(String[] args) {

		Point p=new Point(1,2);
		System.out.println(p.x+" "+p.y+Point.cpt);
		System.out.println(p);

	}
	
}
