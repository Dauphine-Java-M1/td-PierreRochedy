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
	public boolean equals(Object o2) {
		if (!(o2 instanceof Point)) {
			return false;
		}
		Point p = (Point) o2;
		return x==p.x && y==p.y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public boolean isSameAs(Point p) {
		
		if(p.getX() == this.getX() && p.getY() ==this.getY()) {
			return true;
		}
		return false;
	}
	
	public void translate(int dx, int dy) {
		x=dx;
		y=dy;
	}

	public static void main(String[] args) {

		Point p=new Point(1,2);
		System.out.println(p.x+" "+p.y+Point.cpt);
		System.out.println(p);

	}
	
}
