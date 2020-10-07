package fr.dauphine.ja.rochedypierre.shapes;

import java.util.ArrayList;

public class BrokenLign {

	private Point[] brLign;
	private int nbMax;
	

	public BrokenLign(Point[] brLign, int nbMax) {
		
		if(brLign.length>nbMax)
			throw new IllegalArgumentException("Tab plus grand que nb max de Point");
			
		this.brLign = new Point[nbMax];
		this.nbMax = nbMax;
		
		for (int i =0; i<nbMax; i++) {

			this.brLign[i]=brLign[i];

		}
	}
	public void add(Point p) {
		
	}

	
}
