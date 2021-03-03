package Gioco;

public abstract class Gioco {
    protected int punteggio;

    public Gioco() {
    }



    public int getPunteggio() {
        return punteggio;
    }

    public abstract void print();

    public abstract String toString();

    public abstract void lancio();
}
