package Lista;

import java.util.Scanner;

public class FestaMain {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Nodo nodo;
        Scanner in = new Scanner(System.in);
        String s;
        String nome;
        System.out.print("1)Aggiungi un invitato\n2)Elimina un invitato\nInserisci l'operazione da svolgere: ");
        s = in.nextLine();
        if (s.equals("1")) {
            System.out.print("1)Aggiungi in cima\n2)Aggiungi in fondo\n3)Aggiungi in mezzo\nInserisci l'operazione da svolgere: ");
            s = in.nextLine();
            if (s.equals("1")) {
                System.out.print("Inserisci Nome e Cognome: ");
                nome = in.nextLine();
                lista.inserisciInTesta(new Nodo(nome));
            }
            if (s.equals("2")) {
                System.out.print("Inserisci Nome e Cognome: ");
                nome = in.nextLine();
                lista.inserisciInCoda(new Nodo(nome));
            }
            if (s.equals("3")) {
                System.out.print("Inserisci Nome e Cognome: ");
                nome = in.nextLine();
                System.out.print("Inserisci la posizione: ");
                int pos = in.nextInt();
                lista.inserisciInPos(new Nodo(nome), pos);
            }
        }
        if(s.equals("2")){
            System.out.print("1)Elimina dalla cima\n2)Elimina dal fondo\n3)Elimina dal mezzo\nInserisci l'operazione da svolgere: ");
            s = in.nextLine();
            if (s.equals("1")) {
                lista.eliminaInTesta();
            }
            if (s.equals("2")) {
                lista.eliminaInCoda();
            }
            if (s.equals("3")) {
                System.out.print("Inserisci Nome e Cognome: ");
                nome = in.nextLine();
                System.out.print("Inserisci la posizione: ");
                int pos = in.nextInt();
                lista.inserisciInPos(new Nodo(nome), pos);
            }
        }
        lista.visitaLista();
    }
}
