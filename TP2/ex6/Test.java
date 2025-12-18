package tp2.ex6;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Cas 1:");
		
		EqSecondDegre equation = new EqSecondDegre(2.0, 15.5, 3.1);
		
		equation.afficheDiscriminant();
		equation.resoudre();
		equation.afficheSolutions();
		

		System.out.println("Cas 2:");
		// équation il a pas des solutions sur IR
		EqSecondDegre equation2 = new EqSecondDegre(1.0, 1.0, 1.0);

		equation2.afficheDiscriminant();
		equation2.resoudre();
		equation2.afficheSolutions();
	}

}
