package Atleta;

import java.util.*;

public class ProgAtleta {
    public static void main(String[] args) {
        String info;
        Scanner in = new Scanner(System.in);
        Atleta atleta = new Atleta();
        System.out.println("\tAtleta");
        System.out.print("Inserisci il nome: ");
        info = in.next();
        atleta.setNome(info);
        System.out.print("Inserisci il conome: ");
        info = in.next();
        atleta.setCognome(info);
        System.out.print("Inserisci lo sport: ");
        info = in.next();
        atleta.setSport(info);
        atleta.stampa();
    }
}
