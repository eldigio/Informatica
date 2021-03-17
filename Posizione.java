package AUTOVETTURE;

public class Posizione {
    String posizione;
    Automobile auto;

    public Posizione() {
    }

    public Posizione(String posizione) {
        this.posizione = posizione;
    }

    public Posizione(String posizione, Automobile auto) {
        this.posizione = posizione;
        this.auto = auto;
    }

    public void setAuto(Automobile auto) {
        this.auto = auto;
    }

    public void setPosizione(String posizione) {
        this.posizione = posizione;
    }

    public String getPosizione() {
        return posizione;
    }

    public Automobile getAuto() {
        return auto;
    }

    public String toString() {
        if (auto.alimentazioneAGas)
            return "Posizione: " + posizione + "\nMarca: " + auto.marca + "  Modello: " + auto.modello + "\nNumero di telaio: " + auto.numTelaio + "\nPeso a vuoto: " + auto.pesoAVuoto +
                    "\nÈ alimentata a gas" + "  Volume del serbatoio: " + auto.volumeSerbatoio + "\n";
        return "Posizione: " + posizione + "\nMarca: " + auto.marca + "  Modello: " + auto.modello + "\nNumero di telaio: " + auto.numTelaio + "\nPeso a vuoto: " + auto.pesoAVuoto +
                "\nNon è alimentata a gas" + "\n";
    }
}
