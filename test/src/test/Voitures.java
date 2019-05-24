package test;

public class Voitures {
	private String marque= "Renauld" ;

	private  double vitesseMax , PoidsTotal;
	private double PoidsChassis = 120;
	private int puissanceMoteur = 100;
	private double PoidsMoteur ;
	private double calculerPoidsTotal ;
	private double calculerVitesseMax ;
	private String getCalculerPoidsTotal;

	g	public Voitures(String marque, double vitesseMax, double poidsTotal, double poidsChassis, int puissanceMoteur,
			double poidsMoteur, double calculerPoidsTotal, double calculerVitesseMax) {
		super();
		this.marque = marque;
		this.vitesseMax = vitesseMax;

		this.PoidsChassis = poidsChassis;
		this.puissanceMoteur = puissanceMoteur;
		this.PoidsMoteur = poidsMoteur;
		this.calculerPoidsTotal = this.PoidsChassis+this.PoidsMoteur;
		this.calculerVitesseMax = calculerVitesseMax;
	}
	public Voitures()
	{
		System.out.println("Méthode vide");
	}
	public String getMarque() {
		return this.marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public double getVitesseMax() {
		return this.vitesseMax;
	}
	public void setVitesseMax(double vitesseMax) {
		this.vitesseMax = vitesseMax;
	}
	public double getPoidsTotal() {
		return this.PoidsTotal;
	}
	public void setPoidsTotal(double poidsTotal) {
		this.PoidsTotal = poidsTotal;
	}
	public double getPoidsChassis() {
		return this.PoidsChassis;
	}
	public void setPoidsChassis(double poidsChassis) {
		this.PoidsChassis = poidsChassis;
	}
	public int getPuissanceMoteur() {
		return this.puissanceMoteur;
	}
	public void setPuissanceMoteur(int puissanceMoteur) {
		this.puissanceMoteur = puissanceMoteur;
	}
	public double getPoidsMoteur() {
		return this.PoidsMoteur;
	}
	public void setPoidsMoteur(double poidsMoteur) {
		this.PoidsMoteur = poidsMoteur;
	}
	public double getCalculerPoidsTotal() {
		return this.PoidsChassis + this.PoidsMoteur ;
	}
	public void setCalculerPoidsTotal(double calculerPoidsTotal) {

		this.calculerPoidsTotal = this.PoidsMoteur + this.PoidsChassis;

	}

	public double getCalculerVitesseMax() {
		return this.calculerVitesseMax;
	}
	public void setCalculerVitesseMax(double calculerVitesseMax) {
		this.calculerVitesseMax = calculerVitesseMax;
	}
	@Override
	public String toString() {
		return "Voitures [marque=" + this.marque + ", vitesseMax=" + this.vitesseMax + ", PoidsTotal=" + this.PoidsTotal
				+ ", PoidsChassis=" + this.PoidsChassis + ", puissanceMoteur=" + this.puissanceMoteur + ", PoidsMoteur="
				+ this.PoidsMoteur + ", calculerPoidsTotal="+this.getCalculerPoidsTotal();
	}



}

