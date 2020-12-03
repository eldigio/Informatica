import java.util.*;

public class Matrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        boolean ok = false;
        while (!ok) {
            try {
                System.out.print("Inserisci la dimensione: ");
                n = Math.abs(in.nextInt());
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Errore! Riprova");
                in.next();
            }
        }
        int m1[][] = new int[n][n];
        int m2[][] = new int[n][n];
        int ms[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m1[i][j] = (int) (Math.random() * 100);
                m2[i][j] = (int) (Math.random() * 100);
            }
        }
        int d1 = 0, d2 = 0;
        System.out.println("Prima matrice");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Seconda matrice");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m2[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ms[i][j] = m1[i][j] + m2[i][j];
                if (i == j)
                    d1 += ms[i][j];
                if ((i + j) == n - 1)
                    d2 += ms[i][j];
            }
        }
        System.out.println("Somma delle matrici: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ms[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Diagonale principale: " + d1);
        System.out.println("Diagonale secondaria: " + d2);
    }
}