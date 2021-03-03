package Vagone;

public abstract class Vagone{
    private String codice, aziendaCostruttrice;
    private int pesoVuoto, annoCostruzione;

    public abstract int getPesoMedio();

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setAziendaCostruttrice(String aziendaCostruttrice) {
        this.aziendaCostruttrice = aziendaCostruttrice;
    }

    public String getAziendaCostruttrice() {
        return aziendaCostruttrice;
    }

    public void setPesoVuoto(int pesoVuoto) {
        this.pesoVuoto = pesoVuoto;
    }

    public int getPesoVuoto() {
        return pesoVuoto;
    }

    public void setAnnoCostruzione(int annoCostruzione) {
        this.annoCostruzione = annoCostruzione;
    }

    public int getAnnoCostruzione() {
        return annoCostruzione;
    }
}
