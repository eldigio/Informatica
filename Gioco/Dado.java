package Gioco;

public class Dado extends Gioco {
    public Dado() {
        super();
        punteggio = 4;
    }

    public void lancio() {
        punteggio = (int) (Math.random() * 6) + 1;
    }

    public String toString() {
        return "Dado: " + punteggio;
    }

    public void print() {
        System.out.println("il punteggio di dado è: " + getPunteggio());
    }
}
