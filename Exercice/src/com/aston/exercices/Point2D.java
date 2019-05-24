package com.aston.exercices;

public class Point2D {
	int x,y ;
	static int compteur = 0  ;

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;

	}
	public void Translate(int dx, int dy)
	{
		this.x = dx;
		this.y = dy ;
	}
	public int Compteur(int c)
	{
		return this.compteur ;
	}


	@Override
	public String toString() {
		this.compteur = this.compteur +1 ;
		return "Exo2 [x=" + this.x + ", y=" + this.y + "]"+"Valeur du compteur a "+this.compteur ;

	}




}
