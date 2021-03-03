package Abitazioni;

public class Appartamento extends Abitazioni {
    protected int piano, numTerrazzi;
    protected boolean ascensore;

    public Appartamento(int piano, int numTerrazzi, boolean ascensone) {
        super(0);
        this.piano = piano;
        this.numTerrazzi = numTerrazzi;
        this.ascensore = ascensone;
    }

    public void toStringa() {
        super.toStringa();
        System.out.print("Piano: " + piano + "  Terrazzi: " + numTerrazzi + "  Ascensore: ");
        if (ascensore == true) {
            System.out.println("si");
        } else
            System.out.println("no");
    }

    public boolean equals(int piano, int numTerrazzi, boolean ascensone){
        super.equals(getNumStanze(),getSuperficie(),getIndirizzo(),getCitta());
        return this.piano == piano && this.numTerrazzi == numTerrazzi && this.ascensore == ascensone;
    }
}
