package tp2.ex5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Complexe c1 = new Complexe(2.0, 5.5);
		
		System.out.println(c1.toString());
		
		
		Complexe c2 = new Complexe(3.0, 10.2);
		
		Complexe c3 = c1.add(c2);
		System.out.println(c3); // la méthode c3.toString() est appelée
		
		Complexe c4 = c1.mul(c2);
		System.out.println(c4); // la méthode c3.toString() est appelée
	}
}
