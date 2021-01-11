package Solido;

public class Cubo extends Solido {
    private float spigolo;

    public Cubo() {
        super();
        densita = (float) (Math.floor(Math.random() * 599) + 59) / 10;
    }

    public void setSpigolo(float spigolo) {
        this.spigolo = spigolo;
    }

    public float volume() {
        return (float) (Math.floor(Math.pow(spigolo, 3)) / 100);
    }

    public float superficie() {
        return (float) (Math.floor(6 * (Math.pow(spigolo, 2))) / 100);
    }

    public float peso() {
        return (float) (Math.floor(densita * volume()) / 100);
    }

    public void print() {
        System.out.print("spigolo: " + spigolo + "  volume = " + spigolo + "^2 = " + volume());
        System.out.print("  superficie = 6(" + spigolo + "^2 = " + superficie());
        System.out.println("  peso = " + densita + " * " + volume() + " = " + peso());
    }
}
