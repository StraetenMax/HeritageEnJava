
public class TestHeritage {

	public static void main(String[] args) {
		Enfant enfant1 = new Enfant();
		System.out.println(enfant1.nombreDeTetes());
		System.out.println(new Enfant().nombreDeTetes());
		System.out.println(new Carre1().aire());
		System.out.println(new Triangle().aire());
		System.out.println(new Cercle().aire1());
		System.out.println(new Triangle().aire1());
		System.out.println(new Carre1().aire1());
		System.out.println(new Carre1().aire2());
	}

}
