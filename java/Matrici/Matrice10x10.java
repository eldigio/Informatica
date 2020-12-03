import java.util.Arrays;

public class Matrice10x10 {
    public static void main(String[] args) {
        int m[][] = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m[i][j] = (int) (Math.random() * 10);
            }
        }
        int n = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(m[i][j] + "\t");
                if (m[i][j] == 0)
                    n++;
            }
            System.out.println();
        }
        System.out.println("Ci sono " + n + " zeri");
    }
}
