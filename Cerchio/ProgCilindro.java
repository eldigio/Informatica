package Cerchio;

public class ProgCilindro {
    public static void main(String[] args) {
        Cilindro[] cilindro = new Cilindro[10];
        Cerchio cerchio;
        System.out.println("Senza classe Cerchio");
        for (int i = 0; i < 10; i++) {
            cilindro[i] = new Cilindro();
            cilindro[i].setH((int) (Math.random() * 9) + 1);
            cilindro[i].setR((int) (Math.random() * 9) + 1);
            cilindro[i].stampa();
        }
        System.out.println("Con classe Cerchio");
        for (int i = 0; i < 10; i++) {
            cerchio = new Cerchio((int) (Math.random() * 9) + 1);
            cerchio.setRaggio((int) (Math.random() * 9) + 1);
            cilindro[i].stampa2();
        }
    }
}