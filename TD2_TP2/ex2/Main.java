package TD2_TP2.ex2;

import tp2.ex2.Compteur;

public class Main {

    public static void main(String[] args) {
        Compteur[] compteurs = new Compteur[100];

        for (int i = 0; i < compteurs.length; i++) {
            compteurs[i] = new Compteur();
        }

        for (int i = 0; i < compteurs.length; i++) {

            for (int j = 0; j < i; j++) {
                compteurs[i].up();
            }
        }

        for (int i = 0; i < compteurs.length; i++) {
            System.out.print(" " + compteurs[i].getValue());
        }

        int somme = 0;

        for (int i = 0; i < compteurs.length; i++) {
            somme = somme + compteurs[i].getValue();
        }

        System.out.println("");
        System.out.print("La somme : " + somme);

    }
}
