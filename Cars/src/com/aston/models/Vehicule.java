package com.aston.models;

public  abstract class Vehicule  {
	private String marque ;
	private String couleur ;
	private int  nombrer ;
	protected  int  km ;
	public String getMarque() {
		return this.marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getCouleur() {
		return this.couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getNombrer() {
		return this.nombrer;
	}
	public void setNombrer(int nombrer) {
		this.nombrer = nombrer;
	}
	public int getKm() {
		return this.km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public Vehicule(String marque, String couleur, int nombrer, int km) {
		super();
		this.marque = marque;
		this.couleur = couleur;
		this.nombrer = nombrer;
		this.km = km;
	}
	@Override
	public String toString() {
		return "Vehicule [marque=" + this.marque + ", couleur=" + this.couleur + ", nombrer=" + this.nombrer + ", km=" + this.km
				+ ", getMarque()=" + this.getMarque() + ", getCouleur()=" + this.getCouleur() + ", getNombrer()=" + this.getNombrer()
				+ ", getKm()=" + this.getKm() + ", getClass()=" + this.getClass() + ", hashCode()=" + this.hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
