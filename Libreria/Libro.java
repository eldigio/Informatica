package Libreria;

public class Libro {
    private String titolo, autore;
    private int codice, numCopie;
    private double prezzo;

    public Libro() {
    }

    public Libro(String titolo, String autore, int codice, int numCopie, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.codice = codice;
        this.numCopie = numCopie;
        this.prezzo = prezzo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public void setNumCopie(int numCopie) {
        this.numCopie = numCopie;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public int getNumCopie() {
        return numCopie;
    }

    public String getAutore() {
        return autore;
    }

    public void prestito(int cod) {
        if (cod == getCodice()) {
            System.out.println("Prestito effettuato con successo!");
            numCopie--;
        }
    }

    public void restituzione(int cod) {
        if (cod == getCodice()) {
            System.out.println("Restituzione effettuata con successo!");
            numCopie++;
        }
    }

    public String tostring() {
        return "Titolo: " + getTitolo() + "\tAutore: " + getAutore() + "\tCodice: " + getCodice() + "\tNumCopie: " + getNumCopie() + "\tPrezzo: " + getPrezzo();
    }
}
