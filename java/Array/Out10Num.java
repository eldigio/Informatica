import java.util.*;

public class Out10Num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float v[] = new float[10];
        int tot = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Inserisci il " + (i + 1) + "° numero: ");
            try {
                v[i] = input.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Non hai inserito un numero, riprova!");
                continue;
            }
            tot += v[i];
        }
        System.out.println("Il totale dei 10 numeri inseriti è: " + tot);
    }
}
