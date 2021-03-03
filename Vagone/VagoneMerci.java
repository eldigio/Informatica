package Vagone;

public class VagoneMerci extends Vagone {
    private int volumeCarico, pesoMaxCarico, pesoEffCarico;

    public VagoneMerci() {
        super();
    }

    public void setVolumeCarico(int volumeCarico) {
        this.volumeCarico = volumeCarico;
    }

    public int getVolumeCarico() {
        return volumeCarico;
    }

    public void setPesoMaxCarico(int pesoMaxCarico) {
        this.pesoMaxCarico = pesoMaxCarico;
    }

    public int getPesoMaxCarico() {
        return pesoMaxCarico;
    }

    public void setPesoEffCarico(int pesoEffCarico) {
        this.pesoEffCarico = pesoEffCarico;
    }

    public int getPesoEffCarico() {
        return pesoEffCarico;
    }

    public int getPesoMedio() {
        return pesoEffCarico;
    }

    public void print() {
        System.out.println("\tVagone Merci\nCodice: " + getCodice() + "  Peso a vuoto: " + getPesoVuoto() + " ton\nAzienda costruttrice: " + getAziendaCostruttrice()
                + "  Anno di costruzione : " + getAnnoCostruzione() + "\nVolume di carico: " + getVolumeCarico() + " ton  Peso massimo di carico: " + getPesoMaxCarico() +
                " ton  Peso effettivo di carico: " + getPesoEffCarico() + " ton");
    }
}
