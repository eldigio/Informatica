package Solido;

public class Sfera extends Solido {
    private float raggio;

    public Sfera() {
        super();
        densita = (float) (Math.floor(Math.random() * 499) + 49) / 10;
    }

    public void setRaggio(float raggio) {
        this.raggio = raggio;
    }

    public float volume() {
        return (float) (Math.floor(4 / 3 * Math.PI * Math.pow(raggio, 3)) / 100);
    }

    public float superficie() {
        return (float) (Math.floor(Math.pow(raggio, 2) * (4 * Math.PI)) / 10);
    }

    public float peso() {
        return (float) (Math.floor(densita * volume()) / 100);
    }

    public void print() {
        System.out.print("raggio: " + raggio + "  volume = " + "4/3 * 3.14" + " * " + raggio + "^3 = " + volume());
        System.out.print("  superficie = " + raggio + "^2 * 4(3.14) = " + superficie());
        System.out.println("  peso = " + densita + " * " + volume() + " = " + peso());
    }
}
