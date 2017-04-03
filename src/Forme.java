
abstract public class Forme {
	//attribut
	protected int cote = 4;
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
}
