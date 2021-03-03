package Atleta;

import java.util.*;

public class ProgAtleta1 {
    public static void main(String[] args) {
        String info;
        Scanner in = new Scanner(System.in);
        Atleta atleta = new Atleta("Cristiano", "Ronaldo", "Calcio");
        System.out.println("\tAtleta");
        atleta.stampa();
    }
}