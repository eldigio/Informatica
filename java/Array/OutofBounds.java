import java.util.Scanner;

public class OutofBounds {
    public static void main(String[] args) {
        int v[] = new int[10];
        Scanner in = new Scanner(System.in);
        int i = 0, x = 0;
        try {
            System.out.print("Inserisci l'indice: ");
            i = in.nextInt();
            System.out.print("Inserisci il valore: ");
            x = in.nextInt();
            v[i] = x;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stai provando ad accedere ad una cella di memoria non allocata!");
        }
    }
}
