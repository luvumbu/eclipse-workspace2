package ndenga;

public class Ville{
	//Stocke le nom de notre ville
	private String nomVille;
	//Stocke le nom du pays de notre ville
	private String nomPays;
	//Stocke le nombre d'habitants de notre ville
	int nbreHabitants;

	//Constructeur par défaut
	public Ville(String string, String string2){
		System.out.println("Création d'une ville !");
		this.nomVille = "Inconnu";
		this.nomPays = "Inconnu";
		this.nbreHabitants = 0;
	}
}