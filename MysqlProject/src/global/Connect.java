package global;import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {


	public static void main(String[] args) {

		try {
			//Chargement d'un driver Mysql
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRIVER OK!");

			String url = "jdbc:mysql://localhost:3306/global";
			String user="root";
			String passwd="";

			//2.Le driverManager tente d'instancier une connexion vers la base
			Connection conn = DriverManager.getConnection(url, user, passwd);
			System.out.println("Connection effective !");

			//Création d'un objet statement
			Statement state = conn.createStatement();

			//L'objet ResultSet contient le résultat de la requête SQL
			ResultSet result = state.executeQuery("SELECT* FROM employe");
			System.out.println("\n-----------------------------------");
			while(result.next()) {
				System.out.print("\t" + result.getInt("id")+"\t |");
				System.out.print("\t" + result.getString("nom")+"\t |");
				System.out.print("\t" + result.getString("prenom")+"\t |");
				System.out.println("\n-----------------------------------");
			}
			result.close();
			state.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}