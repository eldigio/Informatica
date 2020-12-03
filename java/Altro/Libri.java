package Altro;

import java.util.*;

public class Libri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] titolo = new String[10];
        int[] pagine = new int[10];
        int i = 0;
        do {
            try {
                System.out.print("Inserisci il titolo del " + (i + 1) + "° libro: ");
                titolo[i] = in.next();
                System.out.print("Inserisci il numero di pagine: ");
                pagine[i] = in.nextInt();
                i++;
            } catch (Exception e) {
                System.out.println("Hai inserito valori errati!");
                in.next();
            }
        } while (i < 10);
        for (int j = 0; j < 10; j++) {
            if (pagine[j] <= 100)
                System.out.println("Titolo: " + titolo[j] + "     Pagine: " + pagine[j]);
        }
    }
}
