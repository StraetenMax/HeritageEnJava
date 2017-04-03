
abstract public class Forme {
	//attributs / propriétés
	protected int cote = 4;
	public int prop1 = 5;
	//methodes non abstraite
	public double aire(){
		return cote*cote;
	}
	public int toto(){
		return 34;
	}
	
	//methode abstraite
	abstract public double aire1();
	
	//constructeur
	public Forme(){
		System.out.println("je suis le constructeur de la classe forme");
	}
	
	public Forme(String chaine){
		System.out.println(chaine);
	}
	
	public double moi(){
		return 2.5;
	}
	
	
}
