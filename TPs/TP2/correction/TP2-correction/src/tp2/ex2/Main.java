package tp2.ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compteur c1 = new Compteur();
		
		c1.raz();
		
		c1.up();
		c1.up();
		c1.up();
		
		//System.out.println("Le Compteur a la valeur : " + c1.getValue());
		
		System.out.println(c1.toString());
		
		c1.up();
		
		//System.out.println("Le Compteur a la valeur : " + c1.getValue());
		System.out.println(c1.toString());
		
		c1.raz();

		//System.out.println("Le Compteur a la valeur : " + c1.getValue());
		System.out.println(c1.toString());
	}

}
