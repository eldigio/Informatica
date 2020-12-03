package Email;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        boolean ok;
        String a;
        MetodiEmail email = new MetodiEmail();
        Scanner in = new Scanner(System.in);
        System.out.println("\tEmail");
        System.out.print("Inserisci il destinatario: ");
        a = in.nextLine();
        email.setDestinatario(a);
        System.out.print("Inserisci il mittente: ");
        a = in.nextLine();
        email.setMittente(a);
        System.out.print("Inserisci l'oggetto: ");
        a = in.nextLine();
        email.setOggetto(a);
        System.out.print("Inserisci il testo: ");
        a = in.nextLine();
        email.setTesto(a);
        System.out.print("Destinatario: " + email.getDestinatario() + "\nMittente: " + email.getMittente() + "\n\nOggetto:\n" + email.getOggetto() + "\n\nTesto\n" + email.getTesto());
    }
}
