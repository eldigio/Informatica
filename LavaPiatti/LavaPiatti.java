package LavaPiatti;

import java.util.Vector;

public class LavaPiatti extends Piatto{
    private Vector v = new Vector(1);
    private int numPiatti;

    public LavaPiatti(int numPiatti) {
        super();
        this.numPiatti = numPiatti;
    }

    public void mettiPiatto(float livelloSporco) {
        v.add(0);
        v.add(v.size() -1, new Piatto(livelloSporco));
        System.out.println("Piatto inserito con successo!");
    }

    public void lavaPiatto(Piatto piatto) throws InterruptedException {
        Thread t = Thread.currentThread();
        System.out.print("Controllo...");
        switch (piatto.getLivelloSporco()) {
            case 0:
                t.sleep(400);
                System.out.println("Il piatto è già pulito!");
                break;
            case 1:
                t.sleep(400);
                System.out.println("Il piatto è leggermente sporco");
                t.sleep(200);
                System.out.println("Pulendo...");
                t.sleep(600);
                System.out.println("Il piatto è stato pulito!");
                v.remove(piatto);
                break;
            case 2:
                t.sleep(400);
                System.out.println("Il piatto è un po' sporco");
                t.sleep(200);
                System.out.println("Pulendo...");
                t.sleep(800);
                System.out.println("Il piatto è stato pulito!");
                v.remove(piatto);
                break;
            case 3:
                t.sleep(400);
                System.out.println("Il piatto è molto sporco");
                t.sleep(200);
                System.out.println("Pulendo...");
                t.sleep(1000);
                System.out.println("Il piatto è stato pulito!");
                v.remove(piatto);
                break;
            default:
                System.out.println("Livello di sporco non riconosciuto!!");
                break;
        }
    }

    public void infoPrimoPiatto() {
        System.out.println("Livello di sporco: " + v.get(0));
    }

    public boolean pilaVuota() {
        return v.isEmpty();
    }

    public boolean pilaPiena() {
        return !v.isEmpty();
    }

    public int quantiPiatti() {
        return v.size() - 1;
    }

    public String toString() {
        return "numPiatti " + quantiPiatti() + "  livelloSporco " + livelloSporco;
    }
}
