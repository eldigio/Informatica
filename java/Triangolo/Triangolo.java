package Triangolo;

public class Triangolo {
    private int lTE, l1TI, l2TI, l1TS, l2TS, l3TS;
    private String tipo;

    public Triangolo() {
    }

    public Triangolo(int lTE) {
        this.lTE = lTE;
        tipo = "Equilatero";
    }

    public Triangolo(int l1TI, int l2TI) {
        this.l1TI = l1TI;
        this.l2TI = l2TI;
        tipo = "Isoscele";
    }

    public Triangolo(int l1TS, int l2TS, int l3TS) {
        this.l1TS = l1TS;
        this.l2TS = l2TS;
        this.l3TS = l3TS;
        tipo = "Scaleno";
    }

    public int getPerimetroEquilatero() {
        return lTE * 3;
    }

    public int getPerimetroIsoscele() {
        return (l1TI * 2) + l2TI;
    }

    public int getPerimetroScaleno() {
        return l1TS + l2TS + l3TS;
    }

    public void stampa() {
        if (tipo.equals("Equilatero"))
            System.out.println("lato1: " + lTE + "\tlato2: " + lTE + "\tlato3: " + lTE);
        if (tipo.equals("Isoscele"))
            System.out.println("lato1: " + l1TI + "\tlato2: " + l2TI + "\tlato3: " + l2TI);
        if (tipo.equals("Scaleno"))
            System.out.println("lato1: " + l1TS + "\tlato2: " + l2TS + "\tlato3: " + l3TS);
    }

    public String getTipo() {
        return tipo;
    }
}
