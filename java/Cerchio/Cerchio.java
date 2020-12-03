package Cerchio;

public class Cerchio {
    public int r;

    public Cerchio(int r) {
        this.r = r;
    }

    public void setRaggio(int r) {
        this.r = r;
    }

    public int getRaggio() {
        return r;
    }

    public double area() {
        return (r * r * Math.PI);
    }

    public double lungCirc() {
        return (r * 2 * Math.PI);
    }
}
