package Abitazioni;

public class Villa extends Abitazioni {
    protected int numPiani;
    protected float superficieGiardino;
    protected boolean piscina;

    public Villa(int numPiani, float superficieGiardino, boolean piscina) {
        super(0);
        this.numPiani = numPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public void toStringa() {
        super.toStringa();
        System.out.print("Piani: " + numPiani + "  Giardino: " + superficieGiardino + " m^2  Piscina: ");
        if (piscina == true) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }

    public boolean equals(int numPiani, float superficieGiardino, boolean piscina) {
        super.equals(getNumStanze(), getSuperficie(), getIndirizzo(), getCitta());
        return this.numPiani == numPiani && this.superficieGiardino == superficieGiardino && this.piscina == piscina;
    }
}
