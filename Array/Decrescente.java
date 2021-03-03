import java.util.Arrays;

public class Decrescente {
    public static void main(String[] args) {
        int a[] = new int[10];
        int sos;
        //riempio l'array
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        //bubble sort "invertito"
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    sos = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = sos;
                }
            }
        }
        //stampo l'array
        System.out.print("Array in ordine decrescente: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
