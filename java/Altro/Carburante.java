package Altro;

import java.util.*;

public class Carburante {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v[] = new int[5];
        boolean ok = true;
        do {
            try {
                System.out.print("Inserisci il prezzo del primo distributore: ");
                v[0] = in.nextInt();
                System.out.print("Inserisci il prezzo del secondo distributore: ");
                v[1] = in.nextInt();
                System.out.print("Inserisci il prezzo del terzo distributore: ");
                v[2] = in.nextInt();
                System.out.print("Inserisci il prezzo del quarto distributore: ");
                v[3] = in.nextInt();
                System.out.print("Inserisci il prezzo del quinto distributore: ");
                v[4] = in.nextInt();
                ok = false;
            } catch (Exception e) {
                System.out.println("Errore!");
                in.next();
            }
        } while (ok);
        System.out.println(Arrays.stream(v).max());
        System.out.println(Arrays.stream(v).min());
        System.out.println(Arrays.stream(v).average());
    }
}
