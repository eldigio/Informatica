package Solido;

public abstract class Solido {
    protected float densita;

    public Solido(){}

    public float getDensita() {
        return densita;
    }

    public abstract void print();

    public abstract float volume();

    public abstract float superficie();

    public abstract float peso();
}
