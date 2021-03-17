package AUTOVETTURE;

import java.util.Vector;

public class SmistamentoAuto {
    protected Vector<Posizione> piaz = new Vector<Posizione>();
    Automobile auto = new Automobile();
    Posizione p = new Posizione();

    public SmistamentoAuto() {
    }

    public void add(Posizione pos) {
        piaz.add(pos);
    }

    public void remove(String numTelaio) {
        boolean ok = true;
        for (int i = 0; i < piaz.size() && ok; i++) {
            if ((piaz.get(i)).getAuto().getNumTelaio().equals(numTelaio)) {
                piaz.removeElementAt(i);
                ok = false;
            }
        }
    }

    public void find(String posizione) {
        for (int i = 0; i < piaz.size(); i++) {
            if (piaz.get(i).getPosizione().equals(posizione))
                System.out.println("Autovettura trovata: " + piaz.get(i).toString());
            else
                System.out.println("Autovettura non trovata!");
        }
    }

    public float pesoTot(Vector<String> numTelai) {
        float somma = 0;
        for (int i = 0; i < piaz.size(); i++) {
            String numTelaio = piaz.get(i).getAuto().getNumTelaio();
            for (int j = 0; j < numTelai.size(); j++) {
                if (numTelaio.equals(numTelai.get(j)))
                    somma += (piaz.get(j).getAuto().getPesoAVuoto());
            }
        }
        return somma;
    }

    public float volumeTot(Vector<String> posizione) {
        float somma = 0;
        for (int i = 0; i < piaz.size(); i++) {
            String pos = piaz.get(i).getPosizione();
            for (int j = 0; j < posizione.size(); j++) {
                if (pos.equals(posizione.get(j)) && piaz.get(i).getAuto().getAlimentazioneAGas())
                    somma += (piaz.get(j).getAuto().getVolumeSerbatoio());
            }
        }
        return somma;
    }

    public void print() {
        for (int i = 0; i < piaz.size(); i++) {
            System.out.println(piaz.get(i).toString());
        }
    }

    public int size() {
        return piaz.size();
    }

    public void caricaCamion(Posizione pos) {
        piaz.add(pos);
    }

    public void scaricaCamion() {
        piaz.removeAllElements();
    }
}

