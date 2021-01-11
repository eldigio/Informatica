package Solido;

public class Main {
    public static void main(String[] args) {
        Sfera sfera = new Sfera();
        sfera.setRaggio((float) (Math.floor(Math.random() * 99) + 9) / 10);
        sfera.print();
        Cubo cubo = new Cubo();
        cubo.setSpigolo((float) (Math.floor(Math.random() * 99) + 9) / 10);
        cubo.print();
    }
}
