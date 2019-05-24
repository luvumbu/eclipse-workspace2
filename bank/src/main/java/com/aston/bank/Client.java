package com.aston.bank;

import java.util.ArrayList;

public class Client {
	private String nom ;
	private String prenom ;
	private  int  age ;
	private  int numero ;
	private  ArrayList<Compte> comptes = new ArrayList<Compte>();




	public ArrayList<Compte> getCompte() {
		return this.comptes;
	}
	public void setCompte(ArrayList<Compte> compte) {
		this.comptes = compte;
	}
	public Client(String nom, String prenom, int age, int numero) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.numero = numero;
	}

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return this.prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return this.age;
	}

	public void ajouterCompte(Compte ajouter)
	{

		this.comptes.add(ajouter);
		System.out.println(this.nom);
		System.out.println(this.prenom);
		System.out.println(this.age);

	}

	@Override
	public String toString() {
		return "Client [nom=" + this.nom + ", prenom=" + this.prenom + ", age=" + this.age + ", numero=" + this.numero + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumero() {
		return this.numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
