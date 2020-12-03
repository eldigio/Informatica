package Orologio;

import java.util.Scanner;

class Orologio {
    private int ora, minuti;

    public void OrologioDef() {
        ora = 10;
        minuti = 10;
        System.out.println("Sono le: " + ora + ":" + minuti);
    }

    public void OrologioOre() {
        ora = 10;
        System.out.println("Sono le: " + ora);
    }

    public void OrologioIn() {
        Scanner in = new Scanner(System.in);
        boolean ok = true;
        do {
            try {
                System.out.print("Inserisci l'ora: ");
                ora = in.nextInt();
                System.out.print("Inserisci i minuti: ");
                minuti = in.nextInt();
                ok = false;
            } catch (Exception e) {
                System.out.println("Errore!");
                in.next();
            }
        } while (ok);
        System.out.println("Sono le: " + ora + ":" + minuti);
    }
}