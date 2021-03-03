package Rettangolo;

public class Rettangolo {
    private int x, y;
    private int b, h;
    Punto p;

    public Rettangolo(int x, int y, int b, int h) {
        p = new Punto(x, y);
        this.x = x;
        this.y = y;
        this.b = b;
        this.h = h;
    }

    public Rettangolo(int b, int h) {
        /*p = new Punto(0, 0);
        this.b = b;
        this.h = h;*/
        this(0, 0, b, h);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public int getH() {
        return h;
    }

    public int getArea() {
        return b * h;
    }

    public int getPerimetro() {
        return ((b * 2) + (h * 2));
    }

    public double getDiagonale() {
        return Math.sqrt(Math.pow(h, 2) + Math.pow(b, 2));
    }

    public void stampa() {
        System.out.println("Il rettangolo che si trova nel punto (" + x + "," + y + ")\nAltezza: " + getH() + "\nBase: " + getB() + "\nArea: " + getArea() + "\nPerimetro: " + getPerimetro());
    }
}
