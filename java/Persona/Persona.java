package Persona;

public class Persona {
    private String nome, cognome, indirizzo;
    private int numeroTelefono;

    public Persona(String nome, String cognome, String indirizzo, int numeroTelefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.indirizzo = indirizzo;
        this.numeroTelefono = numeroTelefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public boolean equal(Persona persona) {
        return persona.getNome().equals(nome) && persona.getCognome().equals(cognome) && persona.getIndirizzo().equals(indirizzo);
    }

    public String printString() {
        return "Nome: " + nome + "\nCognome: " + cognome + "\nIndirizzo: " + indirizzo + "\nNumero di telefono: " + numeroTelefono;
    }
}
