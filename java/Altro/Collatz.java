import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero per iniziare: ");
        int n;
        char c = 's';
        while (c == 's' || c == 'S') {
            try {
                n = input.nextInt();
            } catch (Exception e) {
                System.out.println("Non hai inserito un numero!");
                return;
            }
            int cont = 0;
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = (n * 3) + 1;
                }
                System.out.print(n + " - ");
                cont++;
            }
            System.out.println("Hai ciclato : " + cont + " volte");
        }
    }
}
