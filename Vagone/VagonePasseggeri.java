package Vagone;

public class VagonePasseggeri extends Vagone {
    private int classe, postiDisponibili, postiOccupati, pesoOccupante;

    public VagonePasseggeri() {
        super();
    }

    public void setPesoOccupante(int pesoOccupante) {
        this.pesoOccupante = pesoOccupante;
    }

    public int getPesoOccupante() {
        return pesoOccupante;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getClasse() {
        return classe;
    }

    public void setPostiDisponibili(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public void setPostiOccupati(int postiOccupati) {
        this.postiOccupati = postiOccupati;
    }

    public int getPostiOccupati() {
        return postiOccupati;
    }

    public int getPesoMedio() {
        return pesoOccupante * postiOccupati;
    }

    public void print() {
        System.out.println("\tVagone Passeggeri\nCodice: " + getCodice() + "  Peso a vuoto: " + getPesoVuoto() + " ton\nAzienda costruttrice: " + getAziendaCostruttrice()
                + "  Anno di costruzione : " + getAnnoCostruzione() + "\nClasse: " + getClasse() + "°  Posti disponibili: " + getPostiDisponibili() + "  Posti occupati: "
                + getPostiOccupati() + "\nPeso medio per occupante: " + getPesoOccupante() + " Kg  Peso effettivo di carico: " + getPesoMedio() + " Kg");
    }
}
