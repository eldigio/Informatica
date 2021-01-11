package Persona;

public class Main {
    public static void main(String[] args) {
        Persona mittente = new Persona("Mario", "Rossi", "Via A.Volta", (int) (Math.random() * 999999999));
        Persona destinatario = new Persona("Marco", "Bianchi", "Via Italia", (int) (Math.random() * 999999999));
        Data dataMitt = new Data((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1, 2020);
        Data dataDest;
        do {
            dataDest = new Data((int) (Math.random() * 30) + 1, (int) (Math.random() * 11) + 1, 2020);
        }while(dataDest.getGg() < dataMitt.getGg() || dataDest.getMm() < dataMitt.getMm());
        Lettera lettera = new Lettera(mittente, destinatario);
        System.out.println("\tMittente\n" + lettera.getMittente() + "\nSpedito il: " + dataMitt.getData());
        System.out.println("\tDestinatario\n" + lettera.getDestinatario() + "\nRicevuto il: " + dataDest.getData());
    }
}
