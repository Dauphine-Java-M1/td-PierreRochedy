package fr.dauphine.ja.rochedypierre.shapes;

public class Circle {
	
	private Point centre;
	private int rayon;

	public Circle(Point centre, int rayon) {
		this.centre = centre;
		this.rayon = rayon;
	}
	
	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	public void translate(int dx, int dy) {
		centre.translate(dx, dy);
	}
	
	@Override
	public String toString() {
		return "Circle [centre=" + centre + ", rayon=" + rayon + "] et surface = "+this.surface();
	}

	public Point getCenter() {
		return centre;
	}
	
	public double surface() {
		return (Math.PI*Math.pow(rayon, 2));
	}
	
	public boolean contains(Point p) {
		
		if(Math.sqrt((Math.pow(p.getX()-centre.getX(),2) + Math.pow(p.getX()-centre.getX(),2)))<=rayon){
			return true;
		}
		return false;
	}
	
	public static boolean contains(Point p, Circle...circles) {
		
		for(Circle c : circles) {
			if(c.contains(p))
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Point p=new Point(1,2);
		Point p2=new Point(1,2);
		Point p3=new Point(4,4);
		
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p2,2);
		
		c2.translate(1,1);
		System.out.println(c+" "+c2);
		
		Circle c3=new Circle(new Point(1,2), 1);
		c.getCenter().translate(1,1);
		System.out.println(c3);
		
		System.out.println(c.contains(p));
		System.out.println(c.contains(p3));
		
		System.out.println(contains(p3,c2,c3));
	}

}
