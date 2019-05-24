package com.aston.bank;

public class Compte {
	private int numero  ;
	private double solde ;

	public Compte(int numero, double solde) {

		this.numero = numero;
		this.solde = solde;
	}
	public Compte()
	{
		this.numero = 0;
		this.solde = 0 ;
	}


	public void ajouter(double montant) {

		this.solde = this.solde + montant;
	}

	public void retirer(double montant )
	{

		this.solde = this.solde - montant ;
	}

	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return this.solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	@Override
	public String toString() {
		return "Compte [numero=" + this.numero + ", solde=" + this.solde + "]";
	}


}
