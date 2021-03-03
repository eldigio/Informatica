package Gioco;

public class TestMain {
    public static void main(String[] args) {
        Gioco[] arr = new Gioco[4];
        arr[0] = new Moneta();
        arr[0] = new Dado();
        arr[0] = new Dado();
        arr[0] = new Moneta();
        for (int i = 0; i < 3; i++) {
            arr[i].lancio();
            arr[i].print();
        }
    }
}
