package tp2.ex6;

public class EqSecondDegre {
	/**
	 * Les variables qui possèdent les solution de l'équation
	 */
	private double r1;
	private double r2;
	
	/**
	 * Le discriminant Delta
	 */
	private double delta;
	
	/**
	 * Les coefficients: ax² + bx + c = 0
	 */
	private double a;
	private double b;
	private double c;
	
	public EqSecondDegre(double x1, double x2, double x3)
	{
		this.a = x1;
		this.b = x2;
		this.c = x3;
		
		this.calculerDelta();
	}
	
	public void afficheDiscriminant()
	{
		System.out.println("Le discriminant Delta est " + this.delta);
	}
	
	/**
	 * Résoudre l'équation de second degré par rapport le produit de discriminant Delta
	 * Cette méthode traite que le cas de Delta était supérieur au 0
	 */
	public void resoudre()
	{
		/**
		 * Cas 1, si Delta > 0
		 * 
		 * On a deux solution:
		 * 
		 * x1 = (-b - Racine(Delta)) / 2a
		 * x2 = (-b + Racine(Delta)) / 2a
		 */
		if (this.delta > 0) {
			// ordre: (-b - sqrt(delta)) puis (2 * a) puis division
			this.r1 = (-this.b - Math.sqrt(this.delta)) / (2 * this.a);
			
			// ordre: (-b + sqrt(delta)) puis (2 * a) puis division
			this.r2 = (-this.b + Math.sqrt(this.delta)) / (2 * this.a);
		} else if (this.delta == 0) {
			this.r1 = this.r2 = -this.b / (this.a * 2);
		}
	}
	
	public void afficheSolutions()
	{
		if (this.delta > 0) {
			System.out.println("La première racine est " + this.r1);
			System.out.println("La deuxième racine est " + this.r2);
		} else if (this.delta == 0) {
			System.out.println("Une seule Solution : " + this.r1);
		} else {
			System.out.println("Pas de solutions en R.");
		}
	}
	
	/**
	 * Calculer la valeur de discriminant Delta
	 * 
	 * Delta = b^2 - 4ac
	 */
	private void calculerDelta()
	{
		 this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
	}
}
