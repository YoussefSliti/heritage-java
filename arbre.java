package DS2023;

public class arbre extends plante{
 private  String type;
 private final double absorMoy=22;
 
 
 public arbre(String nom,int hauteur,int age,double prix,String type) {
	 super(nom,hauteur,age,prix);
	 this.type=type;
	 
 }
 public String toString () {
		return super.toString()+" type: "+type+" absorMoy: "+absorMoy ;
	}
	
public void description() {
		System.out.println(toString());
	}
public double absorption() {
	if(this.hauteur>50) {
		return absorMoy+3;
	}
	return absorMoy;
}
public String getType() {
    return type;
}
 
}
