package Cerchio;

public class Cilindro {
    private int h, r;
    Cerchio cerchio = new Cerchio(r);

    public Cilindro() {
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public double calcolaVolume() {
        return ((Math.PI * Math.pow(r, 2)) * h);
    }

    public double calcolaAreaSuperficie() {
        return ((2 * Math.PI * r * h) + (2 * Math.PI * Math.pow(r, 2)));
    }

    public void stampa() {
        System.out.println("h: " + getH() + "\traggio: " + r + "\tvolume: " + (float) calcolaVolume() + "\tarea: " + (float) calcolaAreaSuperficie());
    }

    public void stampa2() {
        System.out.println("h: " + getH() + "\traggio: " + cerchio.getRaggio() + "\tvolume: " + (float) calcolaVolume() + "\tarea: " + (float) calcolaAreaSuperficie());
    }
}