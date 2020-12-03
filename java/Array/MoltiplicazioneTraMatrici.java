import java.util.Arrays;

public class MoltiplicazioneTraMatrici {
    public static void main(String[] args) {
        int m[][] = new int[3][2];
        int n[][] = new int[2][3];
        int prod[][] = new int[3][3];
        //Riempio la prima matrice
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = (int) (Math.random() * 99);
            }
        }//Riempio la seconda matrice
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] = (int) (Math.random() * 99);
            }
        }//Calcolo il prodotto
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                for (int k = 0; k < m[i].length && k < m[j].length; k++) {
                    prod[i][j] = prod[i][j] + (m[i][k] * n[k][j]);
                }
            }
        }
        System.out.println("Prima matrice:    " + Arrays.deepToString(m));//Stampo la prima matrice
        System.out.println("Seconda matrice:  " + Arrays.deepToString(n));//Stampo la seconda matrice
        System.out.println("Prodotto:         " + Arrays.deepToString(prod));//Stampo il prodotto tra le matrici
    }
}
