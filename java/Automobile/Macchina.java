package Automobile;

import java.util.Scanner;

public class Macchina {
    private char c;
    private int vel;
    private Scanner in = new Scanner(System.in);

    public Macchina() {
        this.vel = 50;
    }

    public int getVel() {
        return vel;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void Accendi() {
        if (c == 'S') {
            System.out.println("La macchina è spenta. Premere A per accenderla!");
            do {
                System.out.print("Premi A: ");
                c = in.next().toUpperCase().charAt(0);
            } while (c != 'A');
        }
    }

    public void Accellera() {
        if (c == 'A')
            vel += 5;
        if (vel > 90)
            System.out.println("Vai troppo forte. Rallenta!");
    }

    public void Rallenta() {
        if (c == 'F')
            vel -= 10;
        if (vel < 0)
            vel = 0;
    }
}
