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
}
