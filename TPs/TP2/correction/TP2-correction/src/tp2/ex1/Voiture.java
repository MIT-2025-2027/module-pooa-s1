package tp2.ex1;

public class Voiture {


	public void demarrer()
	{
		System.out.println("Démarrage...");
	}
	
	public void mettreCarburant(double volume)
	{
		System.out.println("Carburant de volume " + volume + " est rempli");
	}
	
	
	public void choisirRapport(int rapport)
	{
		System.out.println("Rapport est changé : " + rapport);
	}
	
	public void mettreClignotant(boolean sens)
	{
		if (sens) {
			System.out.println("Clignotant est mis à droite..");
		} else {
			System.out.println("Clignotant est mis à gauche..");
		}
	}
	
	public void freiner()
	{
		System.out.println("Freine...");
	}
	
	public double getVolumeCarburant()
	{		
		return 10.45;
	}
}
