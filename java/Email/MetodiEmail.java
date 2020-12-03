package Email;

public class MetodiEmail {
    private String destinatario, mittente, oggetto, testo;

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setMittente(String mittente) {
        this.mittente = mittente;
    }

    public String getMittente() {
        return mittente;
    }

    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    public String getOggetto() {
        return oggetto;
    }

    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getTesto() {
        return testo;
    }
}
