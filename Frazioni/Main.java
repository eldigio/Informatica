package Frazioni;

public class Main {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 9) + 1;
        int den1 = (int) (Math.random() * 9) + 1;
        int num2 = (int) (Math.random() * 9) + 1;
        int den2 = (int) (Math.random() * 9) + 1;
        Frazioni frazione1 = new Frazioni(num1, den1);
        Frazioni frazione2 = new Frazioni(num2, den2);
        System.out.print(num1 + "/" + den1 + " => ");
        frazione1.print();
        System.out.print(num2 + "/" + den2 + " => ");
        frazione2.print();
        System.out.print(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = ");
        frazione1.somma(frazione2);
        System.out.println(frazione1.mcd(den1,den2));
    }
}
