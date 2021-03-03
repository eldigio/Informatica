package Treno;

public class Main {
    public static void main(String[] args) {
        String[] nomi = new String[]{"Pescara", "Milano", "Como", "Venezia", "Napoli", "Torino", "Palermo", "Udine", "Catania", "Verona"};
        Treno[] treni = new Treno[2];
        for (int i = 0; i < treni.length; i++) {
            treni[i] = new Treno("Treno" + i, nomi[(int) (Math.random() * 9) + 1], nomi[(int) (Math.random() * 9) + 1], (int) (Math.random() * 23), (int) (Math.random() * 60), (int) (Math.random() * 30));
            treni[i].printTreno();
        }
        for (int i = 0; i < treni.length - 1; i++) {
            int ore = (int) (Math.random() * 23), minuti = (int) (Math.random() * 60);
            if (treni[i].partenzaPrima(ore, minuti)) {
                System.out.println("Il treno " + i + " parte prima delle " + ore + ":" + minuti);
            } else {
                System.out.println("Il treno " + i + " parte dopo le " + ore + ":" + minuti);
            }
            /*if (treni[i].equals(treni[i + 1])) {
                System.out.println("Sono lo stesso treno");
            } else {
                System.out.println("Non sono lo stesso treno");
            }*/
            if (treni[i].partePrima(treni[i + 1])) {
                System.out.println("Il treno " + treni[i].getNome() + " parte dopo il treno " + treni[i + 1].getNome());
            } else {
                System.out.println("Il treno " + treni[i].getNome() + " parte prima del treno " + treni[i + 1].getNome());
            }
        }
    }
}
