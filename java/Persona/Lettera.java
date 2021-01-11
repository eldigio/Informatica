package Persona;

public class Lettera {
    private Persona mittente, destinatario;

    public Lettera(Persona mittente, Persona destinatario) {
        this.destinatario = destinatario;
        this.mittente = mittente;
    }

    public String getDestinatario() {
        return destinatario.printString();
    }

    public String getMittente() {
        return mittente.printString();
    }
}
