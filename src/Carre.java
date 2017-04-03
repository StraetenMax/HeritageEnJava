
//public abstract class Carre extends Forme {
public class Carre extends Forme{
	//attribut
		protected int cote = 4;
		protected int cote1= 16;
		public int prop1 = 14;
		//methode
		public double aire1(){
			return cote*cote;
		}
		//constructeur
		/*public Carre() {
			super();
		}*/
		
		/*public Carre(){
			System.out.println(super.prop1 * this.prop1);
		}*/
		
		public Carre(){
			System.out.println(super.moi());
		}
		
		/*public Carre(){
			super("je suis le deuxième");
		}*/
}
