package Libreria;

import java.util.*;

public class Libreria {
    public static void main(String[] args) {
        Libro[] libro = new Libro[10];
        Scanner in = new Scanner(System.in);
        int codice, numCopie = 0;
        System.out.println("\tLibreria");
        for (int i = 0; i < 10; i++) {
            libro[i] = new Libro("titolo" + i, "autore" + i, i + 1, i + 1, (float) (Math.random() * 9) + 1);
            System.out.println(libro[i].tostring());
        }
        System.out.print("\tPrestito\nInserisci un codice: ");
        codice = Math.abs(in.nextInt());
        for (int i = 0; i < 10; i++) {
            numCopie = libro[codice-1].getNumCopie();
            libro[i].prestito(codice);
        }
        for (int i = 0; i < 10 && libro[i].getNumCopie() == numCopie; i++) {
            System.out.println("Libro da restituire: " + libro[i].tostring());
        }
        System.out.print("\tRestituzione\nInserisci un codice: ");
        codice = Math.abs(in.nextInt());
        for (int i = 0; i < 10; i++) {
            if (libro[i].getNumCopie() == numCopie)
                libro[i].restituzione(codice);
        }
    }
}
