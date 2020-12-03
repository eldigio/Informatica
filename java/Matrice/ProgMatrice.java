package Matrice;

import java.util.*;

public class ProgMatrice {
    public static void main(String[] args) {
        int n = 0, k = 0, c = 0;
        Scanner in = new Scanner(System.in);
        String[][] matrice;
        do {
            try {
                System.out.print("Inserisci la dimensione della matrice quadrata: ");
                n = in.nextInt();
                System.out.print("Inserisci la lunghezza minore(k): ");
                k = in.nextInt();
            } catch (Exception e) {
                System.out.println("Hai inerito un valore sbagliato!");
                in.next();
            }
        } while (n <= 0);
        matrice = new String[n][n];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice.length; j++, c++) {
                System.out.print("Inserisci il " + (c + 1) + "° elemento: ");
                matrice[i][j] = in.next();
            }
        }
        Matrice mat = new Matrice(matrice);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + "\t");
            }
            System.out.println();
        }
        String[] v = mat.diagonale(k);
        System.out.println(Arrays.toString(v));
    }
}
