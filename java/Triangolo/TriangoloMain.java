package Triangolo;

import java.util.Scanner;

public class TriangoloMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangolo triangolo;
        boolean ok = true;
        int scelta = 0, l1 = 0, l2 = 0, l3 = 0;
        System.out.println("\tScelta\n1)Equilatero\n2)Isoscele\n3)Scaleno");
        do {
            try {
                System.out.print("Inserisci la scelta: ");
                scelta = Math.abs(in.nextInt());
            } catch (Exception e) {
                System.out.println("Hai inserito un valore errato!");
                in.next();
            }
        } while (scelta > 3 || scelta == 0);
        switch (scelta) {
            case 1:
                do {
                    try {
                        System.out.print("Inserisci il lato: ");
                        l1 = Math.abs(in.nextInt());
                        ok = false;
                    } catch (Exception e) {
                        System.out.println("Hai inserito un valore errato!");
                        in.next();
                    }
                } while (ok);
                triangolo = new Triangolo(l1);
                System.out.println("Il perimetro è: " + triangolo.getPerimetroEquilatero());
                break;
            case 2:
                do {
                    try {
                        System.out.print("Inserisci il primo e secondo lato: ");
                        l1 = Math.abs(in.nextInt());
                        System.out.print("Inserisci il terzo lato: ");
                        l2 = Math.abs(in.nextInt());
                        ok = false;
                    } catch (Exception e) {
                        System.out.println("Hai inserito un valore errato!");
                        in.next();
                    }
                } while (ok);
                triangolo = new Triangolo(l1, l2);
                System.out.println("Il perimetro è: " + triangolo.getPerimetroIsoscele());
                break;
            case 3:
                do {
                    try {
                        System.out.print("Inserisci il primo lato: ");
                        l1 = Math.abs(in.nextInt());
                        System.out.print("Inserisci il secondo lato: ");
                        l2 = Math.abs(in.nextInt());
                        System.out.print("Inserisci il terzo lato: ");
                        l3 = Math.abs(in.nextInt());
                        ok = false;
                    } catch (Exception e) {
                        System.out.println("Hai inserito un valore errato!");
                        in.next();
                    }
                } while (ok);
                triangolo = new Triangolo(l1, l2, l3);
                System.out.println("Il perimetro è: " + triangolo.getPerimetroScaleno());
                break;
        }
    }
}
