package Vector;

import java.util.Vector;

public class Magazzino {
    private Vector v = new Vector(1,1);

    public Magazzino() {
        super();
    }

    public void add(Articolo art) {
        v.add(art);
    }

    public void stampa() {
        Articolo art;
        System.out.println("Magazzino");
        for (int i = 0; i < v.size(); i++) {
            art = (Articolo) v.get(i);
            System.out.println(art);
        }
    }

    public void stampaArticolo(int index) {
        System.out.println(v.get(index));
    }

    public void remove(int index) {
        v.remove(index);
    }

    public int conteggio() {
        return v.size();
    }
}