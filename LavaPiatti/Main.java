package LavaPiatti;

public class Main {
    public static void main(String[] args) {
        LavaPiatti lavaPiatti = new LavaPiatti(10);
        Piatto piatto;
        lavaPiatti.mettiPiatto(2);
        lavaPiatti.mettiPiatto(1);
        System.out.println(lavaPiatti.toString());
    }
}
