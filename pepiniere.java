package DS2023;

public class pepiniere {
	private plante[] inventaire;
	private static final int MAX_PLANTES=1000;
	private int nombreDePlantes;
	
	public pepiniere() {
		this.inventaire=new plante[MAX_PLANTES];
        this.nombreDePlantes=0;
	}
	public void ajoutPlante(plante p) {
		if (nombreDePlantes < MAX_PLANTES) {
            inventaire[nombreDePlantes++] = p;
            System.out.println(p.nom + " ajouter avec succes");
        } else {
            System.out.println("error");
        }
	}
	public void afficherInventaire() {
		for (int i=0;i<nombreDePlantes;i++) {
            inventaire[i].description();
            if (inventaire[i] instanceof fleur) {
                ((fleur)inventaire[i]).fleurir();
            }
            System.out.println();
		}
	}
	public double  totalAbsorptionTotaleCO2() {
		 double total=0;
	        for (int i=0;i<nombreDePlantes;i++) {
	        	if (inventaire[i] instanceof arbre) {
	                total +=((arbre) inventaire[i]).absorption();
	            }
	        }
	       return total;
	}
	public int compterArbresCaduques() {
        int nb=0;
        for (int i=0; i < nombreDePlantes; i++) {
            if (inventaire[i] instanceof arbre) {
                arbre arb =(arbre) inventaire[i];
                if (arb.getType().equals("Caduque")) {
                    nb++;
                }
            }
        }
        return nb;
    }
}
