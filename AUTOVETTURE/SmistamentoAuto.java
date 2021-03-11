package AUTOVETTURE;

import java.util.Vector;

public class SmistamentoAuto {
    Vector<Automobile> piaz;
    Automobile auto = new Automobile();

    public void add(Automobile auto, int i) {
        piaz.add(i, auto);
    }

    public void remove(String numTelaio) {
        boolean ok = false;
        for (int i = 0; i < piaz.size() && ok; i++) {
            if (((Automobile) piaz.get(i)).getNumTelaio().equals(numTelaio)) {
                ok = true;
                piaz.remove(piaz.get(i));
            }
        }
    }

    public Automobile find(int i) {
        return piaz.get(i);
    }

    public float pesoTot(Vector<String> numTelai) {
        float somma = 0;
        for (int i = 0; i < numTelai.size(); i++) {
            if (((Automobile) piaz.get(i)).getNumTelaio().equals(numTelai.get(i)))
                somma += piaz.get(i).getPesoAVuoto();
        }
        return somma;
    }

    public float volumeTot(Vector<Integer> indici) {
        float somma = 0;
        for (int i = 0; i < indici.size(); i++) {
            somma += piaz.get((indici.get(i))).getVolumeSerbatoio();
        }
        return somma;
    }
}
