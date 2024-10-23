package DS2023;

public class main {

	public static void main(String[] args) {
		 pepiniere pepiniere = new pepiniere();

	        plante plante1 = new plante("Plante Verte", 150, 24, 25.0);
	        fleur fleur1 = new fleur("Rose", 50, 12, 15.0, "Rouge", 5);
	        fleur fleur2 = new fleur("Rose", 30, 12, 15.0, "Rouge", 8);
	        arbre arbre1 = new arbre("Chêne", 6000, 120, 150.0, "Caduque"); 
	        arbre arbre2 = new arbre("Pin", 4000, 80, 120.0, "Persistant");

	        pepiniere.ajoutPlante(plante1);
	        pepiniere.ajoutPlante(fleur1);
	        pepiniere.ajoutPlante(fleur2);
	        pepiniere.ajoutPlante(arbre1);
	        pepiniere.ajoutPlante(arbre2);

	        pepiniere.afficherInventaire();


	        System.out.println("total CO2 absorption: "+pepiniere.totalAbsorptionTotaleCO2());

	        System.out.println("nombre d'arbres caduques: "+pepiniere.compterArbresCaduques());
	    }

}
