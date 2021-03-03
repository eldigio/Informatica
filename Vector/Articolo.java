package Vector;

public class Articolo {
    private String codice, descrizione, prezzo, quantita;

    public Articolo() {
        this.codice = "";
    }

    public Articolo(String codice) {
        this.codice = codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCodice() {
        return codice;
    }

    public void setDescrizione(String desc) {
        this.descrizione = desc;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setQuantita(String quan) {
        this.quantita = quan;
    }

    public String getQuantita() {
        return quantita;
    }

    public String toString() {
        return "Codice: " + codice + "  Descrizione: " + descrizione + "  Prezzo: " + prezzo + "  Quantità: " + quantita;
    }
}