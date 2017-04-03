
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
	
		Forme[] tab1 = new Forme[3];
			//	tab1[0] = new Cercle();
			//	tab1[1] = new Triangle();
			//	tab1[2] = new Carre1();
		
		Forme forme1 = new Cercle();
		Forme forme2 = new Triangle();
		Forme forme3 = new Carre1();
		
		tab1[0] = forme1;
		tab1[1] = forme2;
		tab1[2] = forme3;
		
		for(Forme f: tab1){
			System.out.println(f.aire1());
			
		}
    }
	}

