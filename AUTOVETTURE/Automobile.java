package AUTOVETTURE;

public class Automobile {
    String marca, numTelaio, modello, area;
    float pesoAVuoto, volumeSerbatoio;
    boolean alimentazioneAGas;

    public Automobile() {
    }

    public Automobile(String marca, String numTelaio, String modello, String area, float pesoAVuoto, float volumeSerbatoio, boolean alimentazioneAGas) {
        this.marca = marca;
        this.modello = modello;
        this.numTelaio = numTelaio;
        this.area = area;
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

    public String getArea() {
        return area;
    }

    public String toString() {
        if (alimentazioneAGas)
            return "Marca: " + marca + "  Modello: " + modello + "  Nell'area: " + area + "\nPeso a vuoto: " + pesoAVuoto + "  Volume del serbatoio: " + volumeSerbatoio + "\nÈ alimentata a gas";
        else
            return "Marca: " + marca + "  Modello: " + modello + "  Nell'area: " + area + "\nPeso a vuoto: " + pesoAVuoto + "  Volume del serbatoio: " + volumeSerbatoio + "\nNon è alimentata a gas";
    }
}
