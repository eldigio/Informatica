package Altro;

import java.util.*;
import java.lang.*;

public class PrezzoMemorie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double prezzo[] = new double[5], spazio[] = new double[5], costoMin[] = new double[3];
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("Inserisci il prezzo: ");
                prezzo[i] = in.nextDouble();
                System.out.print("Inserisci la capacita(in MB): ");
                spazio[i] = in.nextInt();
            } catch (Exception e) {
                System.out.println("Errore!");
                in.next();
                i--;
            }
        }
        for (int i = 0; i < 3; i++) {
            costoMin[i] = prezzo[i] / spazio[i];
            System.out.println(costoMin[i] + " ");
        }
        int min = 0;
        for (int i = 0; i < 1; i++) {
            if(costoMin[i] < costoMin[i+1])
                min = i;
        }
        System.out.println(min);
        //System.out.println("Il minor costo per MB é: " + prezzo[j] + "/" + spazio[j]);
    }
}