package Automobile;

import java.util.Scanner;

public class Automobile {
    public static void main(String[] args) {
        Macchina macchina = new Macchina();
        Scanner in = new Scanner(System.in);
        char c = ' ';
        do{
            System.out.print("Stai andando a "+ macchina.getVel() + " Km/h. Accellerare o Frenare(A/F): ");
            c = in.next().toUpperCase().charAt(0);
            macchina.setC(c);
            macchina.Accendi();
            macchina.Accellera();
            macchina.Rallenta();
        }while(c != 'A' || c != 'F' || c != 'S');
    }
}
