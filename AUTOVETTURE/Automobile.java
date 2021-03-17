package AUTOVETTURE;

public class Automobile {
    String marca, numTelaio, modello;
    float pesoAVuoto, volumeSerbatoio;
    boolean alimentazioneAGas;
    Posizione pos;

    public Automobile() {
    }

    public Automobile(String marca, String numTelaio, String modello, float pesoAVuoto, float volumeSerbatoio, boolean alimentazioneAGas) {
        this.marca = marca;
        this.modello = modello;
        this.numTelaio = numTelaio;
        this.pesoAVuoto = pesoAVuoto;
        this.volumeSerbatoio = volumeSerbatoio;
        this.alimentazioneAGas = alimentazioneAGas;
    }

    public String getNumTelaio() {
        return numTelaio;
    }

    public float getPesoAVuoto() {
        return pesoAVuoto;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public float getVolumeSerbatoio() {
        return volumeSerbatoio;
    }

    public boolean getAlimentazioneAGas() {
        return alimentazioneAGas;
    }

    public String toString() {
        if (alimentazioneAGas)
            return "Posizione: " + pos.getPosizione() + "\nMarca: " + marca + "  Modello: " + modello + "\nNumero di telaio: " + numTelaio + "\nPeso a vuoto: " + pesoAVuoto +
                    "\nÈ alimentata a gas" + "  Volume del serbatoio: " + volumeSerbatoio + "\n";
        return "Posizione: " + pos.getPosizione() + "\nMarca: " + marca + "  Modello: " + modello + "\nNumero di telaio: " + numTelaio + "\nPeso a vuoto: " + pesoAVuoto +
                "\nNon è alimentata a gas" + "\n";
    }
}
