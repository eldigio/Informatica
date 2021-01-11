package Abitazioni;

public class Main {
    public static void main(String[] args) {
        Appartamento appartamento1 = new Appartamento(6, 0, false);
        appartamento1.setNumStanze(5);
        appartamento1.setSuperficie(590);
        appartamento1.setIndirizzo("Via Italia");
        appartamento1.setCitta("Pescara");
        System.out.println("\tAppartamento1");
        appartamento1.toStringa();
        Appartamento appartamento2 = new Appartamento(6, 0, false);
        appartamento2.setNumStanze(5);
        appartamento2.setSuperficie(590);
        appartamento2.setIndirizzo("Via Italia");
        appartamento2.setCitta("Pescara");
        System.out.println("\tAppartamento2");
        appartamento2.toStringa();
        Villa villa1 = new Villa(3, 600, true);
        villa1.setNumStanze(14);
        villa1.setSuperficie(1200);
        villa1.setIndirizzo("Via Italia 1");
        villa1.setCitta("Pescara");
        System.out.println("\tVilla1");
        villa1.toStringa();
        Villa villa2 = new Villa(4, 380, false);
        villa2.setNumStanze(18);
        villa2.setSuperficie(1350);
        villa2.setIndirizzo("Via Italia 2");
        villa2.setCitta("Sambuceto");
        System.out.println("\tVilla2");
        villa2.toStringa();
        if (appartamento1.equals(appartamento2.piano, appartamento2.numTerrazzi, appartamento2.ascensore)) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
        if (villa1.equals(villa2.numPiani, villa2.superficieGiardino, villa2.piscina)) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
}