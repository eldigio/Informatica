import java.util.*;

public class OperazioniInput {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        float a, b, r1, r2, r3, r4, r5;
        try {
            System.out.println("Inserisci il primo valore: ");
            a = Input.nextFloat();
            System.out.println("Inserisci il secondo valore: ");
            b = Input.nextFloat();
            r1 = a + b;
            r2 = a - b;
            r3 = a * b;
            r4 = a / b;
            r5 = a % b;
        } catch (Exception e) {
            System.out.println("Non hai inserito un numero!");
            return;
        }
        System.out.println("Addizzione: " + r1);
        System.out.println("Sottrazione: " + r2);
        System.out.println("Moltiplicazione: " + r3);
        System.out.println("Divisione: " + r4);
        System.out.println("Resto della divisione: " + r5);
    }
}
