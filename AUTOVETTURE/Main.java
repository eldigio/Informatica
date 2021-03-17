package AUTOVETTURE;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String marca, numTelaio, modello, posizione;
        float pesoAvuoto, volumeSerbatoio = 0;
        boolean alimentazioneAgas;
        Automobile vettura;
        Posizione pos = new Posizione();
        SmistamentoAuto auto = new SmistamentoAuto();
        SmistamentoCamion camion = new SmistamentoCamion();
        Scanner in2 = new Scanner(System.in);
        int n = 0, m = 0, n1 = 0;
        final int x = 100;
        FileReader reader = new FileReader("D:\\Informatica\\Java\\src\\main\\java\\AUTOVETTURE\\input.txt");
        FileReader reader1 = new FileReader("D:\\Informatica\\Java\\src\\main\\java\\AUTOVETTURE\\inputcamion.txt");
        Scanner incam = new Scanner(reader1);
        Scanner in = new Scanner(reader);
        PrintWriter out = new PrintWriter("D:\\Informatica\\Java\\src\\main\\java\\AUTOVETTURE\\output.txt");
        PrintWriter outcam = new PrintWriter("D:\\Informatica\\Java\\src\\main\\java\\AUTOVETTURE\\outputcamion.txt");
        try {
            System.out.println("Benvenuti...\nParco auto Bugatti");
            out.println("Benvenuti...\nParco auto Bugatti");
            while (in.hasNextLine()) {
                String s = in.nextLine();
                Scanner in1 = new Scanner(s);
                while (in1.hasNext()) {
                    marca = in1.next();
                    numTelaio = in1.next();
                    modello = in1.next();
                    posizione = in1.next();
                    pesoAvuoto = in1.nextFloat();
                    volumeSerbatoio = in1.nextFloat();
                    alimentazioneAgas = in1.nextBoolean();
                    vettura = new Automobile(marca, numTelaio, modello, pesoAvuoto, volumeSerbatoio, alimentazioneAgas);
                    pos = new Posizione(posizione, vettura);
                }
                auto.add(pos);
            }
            reader.close();
            do {
                Thread.sleep(10 * x);
                System.out.println("\t\tParco Auto\n");
                Thread.sleep(x);
                System.out.println("\t\tMenu Auto\n");
                Thread.sleep(x);
                auto.print();
                System.out.println("1-Ingresso nuova auto(Specificare la posizione)");
                Thread.sleep(x);
                System.out.println("2-Uscita auto(Specificare numero telaio");
                Thread.sleep(x);
                System.out.println("3-Ricerca auto(Specificare postazione)");
                Thread.sleep(x);
                System.out.println("4-Calcolo peso totale vetture(Specificare numero telaio)");
                Thread.sleep(x);
                System.out.println("5-Calcolo volume serbatoio(Specificare postazione)");
                Thread.sleep(x);
                System.out.println("6-Esci");
                Thread.sleep(x);
                System.out.print("Inserisci la scelta: ");
                out.println("1-Ingresso nuova auto(Specificare la posizione)\n2-Uscita auto(Specificare numero telaio)\n3-Ricerca auto(Specificare postazione)" +
                        "\n4-Calcolo peso totale vetture(Specificare numero telaio)\n5-Calcolo volume serbatoio(Specificare postazione)\n6-Esci\nInserisci la scelta: ");
                n = in2.nextInt();
                out.println(n);
                Thread.sleep(5 * x);
                switch (n) {
                    case 1:
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci la posizione: ");
                        posizione = in2.next();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci la marca: ");
                        marca = in2.next();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci il numero di telaio: ");
                        numTelaio = in2.next();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci il modello: ");
                        modello = in2.next();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci il peso a vouto: ");
                        pesoAvuoto = in2.nextFloat();
                        Thread.sleep(3 * x);
                        out.println("Inserisci la posizione: " + posizione + "Inserisci la marca: " + marca + "Inserisci il numero di telaio: " + "Inserisci il modello: "
                                + "Inserisci il peso a vouto: ");
                        System.out.print("indica se è alimentata a gas(true/false): ");
                        alimentazioneAgas = in2.nextBoolean();
                        if (alimentazioneAgas) {
                            Thread.sleep(4 * x);
                            System.out.print("Inserisci il volume del serbatoio: ");
                            volumeSerbatoio = in2.nextFloat();
                            out.println("Inserisci il volume del serbatoio: " + volumeSerbatoio);
                        }
                        Thread.sleep(3 * x);
                        vettura = new Automobile(marca, numTelaio, modello, pesoAvuoto, volumeSerbatoio, alimentazioneAgas);
                        pos = new Posizione(posizione, vettura);
                        auto.add(pos);
                        Thread.sleep(10 * x);
                        System.out.println("Autovettura aggiunta con successo!");
                        out.println("Autovettura aggiunta con successo!");
                        break;
                    case 2:
                        System.out.print("Inserisci il numero di telaio: ");
                        numTelaio = in2.next();
                        auto.remove(numTelaio);
                        Thread.sleep(10 * x);
                        System.out.println("Autovettura rimossa con successo!");
                        out.println("Autovettura rimossa con successo!");
                        break;
                    case 3:
                        System.out.print("Inserisci la posizione: ");
                        posizione = in2.next();
                        auto.find(posizione);
                        out.println("Autovettura trovata con successo");
                        break;
                    case 4:
                        Vector<String> numTelai = new Vector<String>();
                        System.out.print("Inserisci il numero di auto da sommare: ");
                        m = in2.nextInt();
                        for (int i = 0; i < m; i++) {
                            System.out.print("Inserisci un numero di telaio: ");
                            String s = in2.next();
                            numTelai.add(s);
                        }
                        System.out.println("Il peso totale delle macchine selezionate è: " + auto.pesoTot(numTelai));
                        out.println("Inserisci il numero di auto da sommare: " + m + "\nPeso totale: " + auto.pesoTot(numTelai) + "Calcolo eseguito con successo");
                        break;
                    case 5:
                        Vector<String> posizioni = new Vector<String>();
                        System.out.print("Inserisci il numero di auto da sommare: ");
                        m = in2.nextInt();
                        for (int i = 0; i < m; i++) {
                            System.out.print("Inserisci una posizione: ");
                            String s = in2.next();
                            posizioni.add(s);
                        }
                        System.out.println("Il volume totale delle macchine selezionate è: " + auto.volumeTot(posizioni));
                        out.println("Inserisci il numero di auto da sommare: " + m + "\nVolume totale: " + auto.volumeTot(posizioni) + "Calcolo eseguito con successo");
                        break;
                    default:
                        break;
                }
            } while (n != 6);
            do {
                Thread.sleep(10 * x);
                System.out.println("\t\tParco Auto\n");
                Thread.sleep(x);
                System.out.println("\t\tMenu Camion\n");
                Thread.sleep(x);
                auto.print();
                System.out.println("1-Aggiungi auto al camion");
                Thread.sleep(x);
                System.out.println("2-Scarica il camion");
                Thread.sleep(x);
                System.out.println("3-Esci");
                Thread.sleep(x);
                System.out.print("inserisci la scelta: ");
                n = in2.nextInt();
                switch (n) {
                    case 1:
                        System.out.println("\t\tParco Auto\n");
                        camion.print();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci la posizione: ");
                        posizione = in2.next();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci la marca: ");
                        marca = in2.next();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci il numero di telaio: ");
                        numTelaio = in2.next();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci il modello: ");
                        modello = in2.next();
                        Thread.sleep(3 * x);
                        System.out.print("Inserisci il peso a vouto: ");
                        pesoAvuoto = in2.nextFloat();
                        Thread.sleep(3 * x);
                        out.println("Inserisci la posizione: " + posizione + "Inserisci la marca: " + marca + "Inserisci il numero di telaio: " + "Inserisci il modello: "
                                + "Inserisci il peso a vouto: ");
                        System.out.print("indica se è alimentata a gas(true/false): ");
                        alimentazioneAgas = in2.nextBoolean();
                        if (alimentazioneAgas) {
                            Thread.sleep(4 * x);
                            System.out.print("Inserisci il volume del serbatoio: ");
                            volumeSerbatoio = in2.nextFloat();
                            out.println("Inserisci il volume del serbatoio: " + volumeSerbatoio);
                        }
                        Thread.sleep(3 * x);
                        vettura = new Automobile(marca, numTelaio, modello, pesoAvuoto, volumeSerbatoio, alimentazioneAgas);
                        pos = new Posizione(posizione, vettura);
                        auto.caricaCamion(pos);
                        Thread.sleep(10 * x);
                        System.out.println("Autovettura aggiunta con successo!");
                        out.println("Autovettura aggiunta con successo!");
                        break;
                    case 2:
                        auto.scaricaCamion();
                        break;
                    default:
                        break;
                }
            }
            while (n != 3);
        } catch (Exception e) {
            System.out.println(e);
            out.println("Errore");
        }
        out.close();
        incam.close();
        outcam.close();
    }
}
