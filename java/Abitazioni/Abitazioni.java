package Abitazioni;

public class Abitazioni {
    private int numStanze;
    private float superficie;
    private String indirizzo, citta;

    public Abitazioni(int numStanze) {
        this.numStanze = numStanze;
    }

    public Abitazioni(int numStanze, float superficie, String indirizzo, String citta) {
        this(numStanze);
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;
    }

    public void setNumStanze(int numStanze) {
        this.numStanze = numStanze;
    }

    public int getNumStanze() {
        return numStanze;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getCitta() {
        return citta;
    }

    public void toStringa() {
        System.out.println("Stanze: " + numStanze + "  Superficie: " + superficie + " m^2  Indirizzo: " + indirizzo + "  Città: " + citta);
    }
    public boolean equals(int numStanze, float superficie, String indirizzo, String citta){
        return this.numStanze == numStanze && this.superficie == superficie && this.indirizzo.equals(indirizzo) && this.citta.equals(citta);
    }
}