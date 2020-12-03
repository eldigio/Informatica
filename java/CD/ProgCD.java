package CD;

import java.util.Scanner;

public class ProgCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean ok = true;
        String[] titolo = new String[]{"CIAO", "BENE"};
        int[] minuti = new int[]{3, 2}, secondi = new int[]{3, 50};
        int n = 0, x = 2;
        CD cd = new CD(titolo, minuti, secondi);
        cd.stampa();
        System.out.println("1)Inserisci il nome e la durata delle canzoni");
        System.out.println("2)Modifica il nome o la durata delle canzoni");
        System.out.println("3)Data una canzone restituire la durata");
        do {
            try {
                System.out.print("Inserisci la tua decisione: ");
                n = in.nextInt();
                ok = false;
            } catch (Exception e) {
                System.out.println("Hai inserito un valore sbagliato!");
                in.next();
            }
        } while (ok || n > 3);
        switch (n) {
            case 1:
                ok = true;
                do {
                    try {
                        for (int i = 0; i < x; i++) {
                            System.out.print("Inserisci il titolo della " + (i + 1) + "° canzone: ");
                            titolo[i] = in.next().toUpperCase();
                            System.out.print("Inserisci i minuti: ");
                            minuti[i] = Math.abs(in.nextInt());
                            System.out.print("Inserisci i secondi: ");
                            secondi[i] = Math.abs(in.nextInt());
                        }
                        ok = false;
                    } catch (Exception e) {
                        System.out.println("Hai inserito valori sbagliati!");
                        in.next();
                    }
                } while (ok);
                cd.stampa();
                break;
            case 2:
                System.out.println("\n1)Modifica il nome");
                System.out.println("\n2)Modifica la durata");
                ok = true;
                do {
                    try {
                        System.out.print("Inserisci la tua decisione: ");
                        n = in.nextInt();
                        ok = false;
                    } catch (Exception e) {
                        System.out.println("Hai inserito un valore sbagliato!");
                        in.nextInt();
                    }
                } while (ok || n > 2);
                switch (n) {
                    case 1:
                        for (int i = 0; i < x; i++) {
                            System.out.print("Inserisci il nome della " + (i + 1) + "° canzone: ");
                            titolo[i] = in.next().toUpperCase();
                        }
                        break;
                    case 2:
                        ok = true;
                        do {
                            try {
                                for (int i = 0; i < x; i++) {
                                    System.out.println(titolo[i] + "\t");
                                    System.out.print("Inserisci i minuti: ");
                                    minuti[i] = Math.abs(in.nextInt());
                                    System.out.print("Inserisci i secondi: ");
                                    secondi[i] = Math.abs(in.nextInt());
                                }
                                ok = false;
                            } catch (Exception e) {
                                System.out.println("Hai inserito valori sbagliati!");
                                in.next();
                            }
                        } while (ok);
                }
                cd.stampa();
                break;
            case 3:
                String s;
                System.out.print("Inserisci il nome di una canzone: ");
                s = in.next().toUpperCase();
                if(cd.getDurata(s) != 0)
                    System.out.println("La durata di " + s + " è: " + minuti[cd.getDurata(s)]+":"+secondi[cd.getDurata(s)]);
                else
                    System.out.println("Hai inserito il nome in modo errato!");
                break;
        }
    }
}
