
public class TestHeritage {

	public static void main(String[] args) {
		Enfant enfant1 = new Enfant();
		System.out.println(enfant1.nombreDeTetes());
		System.out.println(new Enfant().nombreDeTetes());
		System.out.println(new Carre().aire());
	}

}
