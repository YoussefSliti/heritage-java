package DS2023;

public class plante {
	protected String nom;
	protected double hauteur,prix;
	protected int age;
	
	public plante(String nom,int hauteur,int age,double prix) {
		this.nom=nom;
		this.hauteur=hauteur;
		this.age=age;
		this.prix=prix;
		
	}
	public String toString () {
		return "Nom: "+nom+" hauteur: "+hauteur+" age: "+age+" prix: "+prix ;
	}
	
	public void description() {
		System.out.println(toString());
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
}
