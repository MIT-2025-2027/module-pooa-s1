package tp2.ex1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Voiture
		 */
		Voiture voiture = new Voiture();
		
		// étape 1
		voiture.demarrer();
		voiture.choisirRapport(1);

		// étape 2
		voiture.choisirRapport(2);
		voiture.mettreClignotant(false);
		
		// étape 3
		double volume = voiture.getVolumeCarburant();
		System.out.println("Volume Carburant : " + volume + " L");
		
		// étape 4
		voiture.freiner();
		voiture.mettreClignotant(true);
		
		// étape 5
		voiture.mettreCarburant(52.5);
		
		
		/**
		 * Calculette
		 *
		 */
		Calculette calculette = new Calculette();
		
		calculette.cinq();
		calculette.six();
		calculette.quatre();
		calculette.div();
		calculette.deux();
		calculette.egal();
		
		System.out.println(calculette.getValue());
		
		calculette.raz();
		
	}

}
