package fr.dauphine.ja.rochedypierre.shapes;

public class Ring extends Circle{
	
	private int rayon_interne;

	public Ring(Point centre, int rayon, int rayon_interne) {
		
		super(centre, rayon);
		if(rayon_interne>rayon)
			throw new IllegalArgumentException("Le rayon interne ne peux pas être superieur au rayon du cercle");
		this.rayon_interne = rayon_interne;
	}

	@Override
	public boolean equals(Object o2) {
		if (!(o2 instanceof Ring)) {
			return false;
		}
		Ring p = (Ring) o2;
		return rayon_interne==p.rayon_interne && this.getRayon() == p.getRayon() && this.getCentre() == p.getCentre();
	}
	
	@Override
	public boolean contains(Point p) {
		
		if(super.contains(p) && Math.sqrt((Math.pow(p.getX()-super.getCentre().getX(),2) + 
				Math.pow(p.getY()-super.getCentre().getY(),2)))>=rayon_interne){
			return true;
		}
		return false;
	}
	
	public static boolean contains(Point p, Ring...rings) {
		for(Ring r : rings) {
			if(r.contains(p))
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Ring [rayon_interne = " + rayon_interne + " " + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		
		Point p=new Point(1,2);
		Point p2=new Point(1,2);
		Point p3=new Point(4,4);
		
		Ring r = new Ring(p,5,2);
		Ring r2 = new Ring(p2,4,2);
		System.out.println(r);
		
		System.out.println(r.contains(p2));
		System.out.println(r.contains(p3));
		
		System.out.println(contains(p3,r,r2));
		System.out.println(contains(p2,r,r2));

	}

	

	

}
