package Vector;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Articolo articolo = new Articolo();
        Magazzino magazzino = new Magazzino();
        Scanner in = new Scanner(System.in);
        String scelta = "";
        do {
            System.out.print("a. inserimento di nuovi articolo\nb. stampa completa del magazzino\nc. visualizzazione di un"
                    + " dato articolo\nd. eliminazione di un dato articolo\ne. conteggio degli articolo registrati" +
                    "\nInserisci l'operazione da svolgere(inserisci 0 per terminare): ");

            scelta = in.nextLine().toLowerCase();
            switch (scelta) {
                case "a":
                    String s = "";
                    System.out.print("Inserisci il codice: ");
                    s = in.nextLine().toLowerCase();
                    articolo.setCodice(s);
                    System.out.print("Inserisci la descrizione: ");
                    s = in.nextLine().toLowerCase();
                    articolo.setDescrizione(s);
                    System.out.print("Inserisci il prezzo: ");
                    s = in.nextLine();
                    articolo.setPrezzo(s);
                    System.out.print("Inserisci la quantità: ");
                    s = in.nextLine();
                    articolo.setQuantita(s);
                    magazzino.add(articolo);
                    break;
                case "b":
                    magazzino.stampa();
                    break;
                case "c":
                    System.out.print("Indica l'indice dell'articolo: ");
                    s = in.nextLine();
                    magazzino.stampaArticolo(Integer.parseInt(s));
                    break;
                case "d":
                    System.out.print("Indica l'indice dell'articolo da eliminare: ");
                    s = in.nextLine();
                    magazzino.remove(Integer.parseInt(s));
                    break;
                case "e":
                    System.out.println(magazzino.conteggio());
                default:
                    break;
            }
        } while (!scelta.equals("0"));
    }
}