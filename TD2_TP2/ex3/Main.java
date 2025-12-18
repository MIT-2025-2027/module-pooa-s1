package TD2_TP2.ex3;

public class Main {

    public static void main(String[] args) {
        Integer[] table = new Integer[100];

        for (int i = 0; i < table.length; i++) {
            table[i] = i;
        }

        for (int i = 0; i < table.length; i++) {
            System.out.print(" " + table[i]);
        }

        int somme = 0;

        for (int i = 0; i < table.length; i++) {
            somme = somme + table[i];
        }

        System.out.println("");
        System.out.print("La somme : " + somme);
    }
}
