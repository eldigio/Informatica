package Gioco;

public class Moneta extends Gioco {
    public Moneta() {
        super();
        punteggio = 1;
    }

    public void lancio() {
        punteggio = (int) (Math.random() * 2);
    }

    public String toString() {
        return "Moneta: " + punteggio;
    }

    public void print() {
        System.out.println("Il punteggio di moneta è: " + punteggio);
    }
}
