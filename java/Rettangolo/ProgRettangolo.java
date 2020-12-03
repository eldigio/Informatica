package Rettangolo;

import java.util.Scanner;

public class ProgRettangolo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = (int) (Math.random() * 10), y1 = (int) (Math.random() * 10), b1 = (int) (Math.random() * 10), h1 = (int) (Math.random() * 10);
        Rettangolo rettangolo1 = new Rettangolo(x1, y1, b1, h1);
        rettangolo1.stampa();
        int b2 = (int) (Math.random() * 10), h2 = (int) (Math.random() * 10);
        Rettangolo rettangolo2 = new Rettangolo(b2, h2);
        rettangolo2.stampa();
        if (rettangolo1.getArea() > rettangolo2.getArea())
            System.out.println("L'area più estesa è del primo rettangolo: " + rettangolo1.getArea());
        else
            System.out.println("L'area più estesa è del secondo rettangolo: " + rettangolo2.getArea());
    }
}
