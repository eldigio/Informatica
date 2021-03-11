package AUTOVETTURE;

import java.util.Vector;

public class SmistamentoCamion {
    Vector<Automobile> camion;
    Automobile auto = new Automobile();

    public void caricaCamion(Automobile auto) {
        camion.add(auto);
    }

    public void caricaCamion(Automobile auto, int i) {
        camion.add(i, auto);
    }

    public void scaricaCamion(){
        camion.clear();
    }
}
