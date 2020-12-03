import java.util.Scanner;

public class Operazioni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//uso lo scanner per facilitare l'input
        float a = 5, b = 3;//float per eseguire la divisione decimale
        float r1 = a / b;
        System.out.println(a + " / " + b + " = " + r1);
        char c = 'a';
        short s = 5000;
        int r2 = (int) c * s;//cast per il valore intero di 'a'
        System.out.println(c + " * " + s + " = " + r2);
        int i = 6;//intero per l'addizzione
        float f = 3.14F;
        float r3 = i + f;
        System.out.println(i + " + " + f + " = " + r3);
        float r4 = r1 - r2 - r3;//float per risultato finale decimale
        System.out.println(r1 + " - " + r2 + " - " + r3 + " = " + r4);
    }
}
