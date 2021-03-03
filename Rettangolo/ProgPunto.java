package Rettangolo;

import java.util.*;

public class ProgPunto {
    public static void main(String[] args) {
        int x = 0, y = 0;
        Punto p1 = new Punto(x, y);
        Punto p2 = new Punto(y);
        Punto p3 = new Punto(x, y);
        Scanner in = new Scanner(System.in);
        boolean ok = true;
        Punto p = new Punto(x, y);
        do {
            try {
                System.out.print("Inserisci la x: ");
                x = in.nextInt();
                //p.setX(x);
                System.out.print("inserisci la y: ");
                y = in.nextInt();
                //p.setY(y);
                ok = false;
            } catch (InputMismatchException e) {
                System.out.println("Hai sbagliato ad inserire i numeri!");
                in.next();
            }
        }while(ok);
        switch (p1.localizzazioneQuadrante()) {
            case 0 -> System.out.println("Origine");
            case 1 -> System.out.println("1° quadrante");
            case 2 -> System.out.println("2° quadrante");
            case 3 -> System.out.println("3° quadrante");
            case 4 -> System.out.println("4° quadrante");
        }
        /*p2.Input();
        switch (p2.localizzazioneQuadrante()) {
            case 5 -> System.out.println("Origine");
            case 1 -> System.out.println("1° quadrante");
            case 2 -> System.out.println("2° quadrante");
            case 3 -> System.out.println("3° quadrante");
            case 4 -> System.out.println("4° quadrante");
        }
        p3.Input();
        switch (p3.localizzazioneQuadrante()) {
            case 5 -> System.out.println("Origine");
            case 1 -> System.out.println("1° quadrante");
            case 2 -> System.out.println("2° quadrante");
            case 3 -> System.out.println("3° quadrante");
            case 4 -> System.out.println("4° quadrante");
        }*/
    }
}

