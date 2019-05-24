package test;
public class Voitures2 {
	private String marque= "Renauld" ;

	private  double vitesseMax , PoidsTotal;

	private int  chassis ;
	private double PoidsMoteur ;
	private double calculerPoidsTotal ;
	private double calculerVitesseMax ;
	Chassis PoidsChassis ;
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

	public double getPoidsMoteur() {
		return this.PoidsMoteur;
	}
	public void setPoidsMoteur(double poidsMoteur) {
		this.PoidsMoteur = poidsMoteur;
	}
	public double getCalculerPoidsTotal() {
		return this.calculerPoidsTotal;
	}
	public void setCalculerPoidsTotal(double calculerPoidsTotal) {
		this.calculerPoidsTotal = calculerPoidsTotal;
	}
	public double getCalculerVitesseMax() {
		return this.calculerVitesseMax;
	}
	public void setCalculerVitesseMax(double calculerVitesseMax) {
		this.calculerVitesseMax = calculerVitesseMax;
	}
	public Chassis getPoidsChassis() {
		return this.PoidsChassis;
	}
	public void setPoidsChassis(Chassis poidsChassis) {
		this.PoidsChassis = poidsChassis;
	}
	public   int  test( int  x)
	{
		return this.chassis =  x;
	}
	@Override
	public String toString() {
		return "Voitures2 [marque=" + this.marque + ", vitesseMax=" + this.vitesseMax + ", PoidsTotal=" + this.PoidsTotal
				+ ", chassis=" + this.chassis + ", PoidsMoteur=" + this.PoidsMoteur + ", calculerPoidsTotal=" + this.calculerPoidsTotal
				+ ", calculerVitesseMax=" + this.calculerVitesseMax + ", PoidsChassis=" + this.PoidsChassis + "]";
	}





}

