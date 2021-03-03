package LavaPiatti;

public class Piatto {
    protected int numPiatti, livelloSporco;

    public Piatto() {
        this.numPiatti = 0;
        this.livelloSporco = 0;
    }

    public Piatto(int numPiatti) {
        this.numPiatti = numPiatti;
        this.livelloSporco = 1;
    }

    public Piatto(float livelloSporco) {
        this.numPiatti = 1;
        this.livelloSporco = (int) livelloSporco;
    }

    public Piatto(int numPiatti, int livelloSporco) {
        this.numPiatti = numPiatti;
        this.livelloSporco = livelloSporco;
    }

    public void setNumPiatti(int numPiatti) {
        this.numPiatti = numPiatti;
    }

    public void setLivelloSporco(int livelloSporco) {
        this.livelloSporco = livelloSporco;
    }

    public int getNumPiatti() {
        return numPiatti;
    }

    public int getLivelloSporco() {
        return livelloSporco;
    }
}
