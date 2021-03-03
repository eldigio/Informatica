import java.util.*;

public class DueArrayMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0, cont = 0;
        do {
            try {
                System.out.print("Inserisci la dimensione del vettore: ");
                n = in.nextInt();
                cont = 1;
            } catch (Exception e) {
                System.out.println("Hai sbagliato devi inserire un numero valido!");
                in.next();
            }
        } while (cont != 1);
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
            b[i] = (int) (Math.random() * 100);
            c[i] = Math.max(a[i], b[i]);
        }
        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("c: " + Arrays.toString(c));
    }
}
