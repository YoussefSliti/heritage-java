package DS2023;

public class fleur extends plante {
	private String couleur;
	private int moisF;
	
	public fleur(String nom,int hauteur,int age,double prix,String couleur,int moisF) {
		super(nom,hauteur,age,prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}
	
	
	public String toString () {
		return super.toString()+" couleur: "+couleur+" moisF: "+moisF ;
	}
	
	public void description() {
		System.out.println(toString());
	}
	public String getCouleur() {
		return couleur;
	}
	public void fleurir() {
		if(moisF==4 || moisF==5 || moisF==6) {
			System.out.println("c'est un fleur");
		}else {
			System.out.println("n'est pas un fleur");
		}
	}
}
