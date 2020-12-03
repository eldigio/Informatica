package Dipendente;

public class Dipendente {
    private String nome;
    private double stipendio;

    public Dipendente() {
        this("pippo", 0);
    }

    public Dipendente(String nome, double stipendio) {
        this.nome = nome;
        this.stipendio = stipendio;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStipendio(double stipendio) {
        this.stipendio = stipendio;
    }

    public String getNome() {
        return nome;
    }

    public double getStipendio() {
        return stipendio;
    }

    public void raiseSalary(double byPercent) {
        double sos = stipendio / 100;
        stipendio += (sos * byPercent);
    }
}
