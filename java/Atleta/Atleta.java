package Atleta;

public class Atleta {
    private String nome;
    private String cognome;
    private String sport;

    Atleta() {
    }

    Atleta(String nome, String cognome, String sport) {
        this.nome = nome;
        this.cognome = cognome;
        this.sport = sport;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getSport() {
        return sport;
    }

    public void stampa() {
        System.out.println("Nome: " + nome);
        System.out.println("Cognome: " + cognome);
        System.out.println("Sport: " + sport);
    }
}
