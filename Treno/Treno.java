package Treno;

public class Treno {
    private String nome, partenza, arrivo;
    private int ore, minuti, binario;

    public Treno(String nome, String partenza, String arrivo, int ore, int minuti, int binario) {
        this.nome = nome;
        this.partenza = partenza;
        this.arrivo = arrivo;
        this.ore = ore;
        this.minuti = minuti;
        this.binario = binario;
    }

    public Treno() {
        this("", "", "", 0, 0, 0);
    }

    public String getNome() {
        return nome;
    }

    public boolean partenzaPrima(int ore, int minuti) {
        if(ore == this.ore && minuti == this.minuti)
            return false;
        else if(ore == this.ore && this.minuti < minuti)
            return true;
        else if(minuti == this.minuti && this.ore < ore)
            return true;
        else if(ore > this.ore && minuti > this.minuti)
            return false;
        else if(ore < this.ore && minuti < this.minuti)
            return true;
        return false;
    }

    public void printTreno() {
        System.out.println("Nome: " + nome + " da " + partenza + " a " + arrivo + ", partenza " + ore + ":" + minuti + ", binario " + binario);
    }

    public String toStringa() {
        return "Nome: " + nome + " da " + partenza + " a " + arrivo + ", partenza " + ore + ":" + minuti + ", binario " + binario;
    }

    public boolean equals(Treno treno) {
        treno = new Treno();
        return nome.equals(treno.nome) && partenza.equals(treno.partenza) && arrivo.equals(treno.arrivo) && ore == treno.ore && minuti == treno.minuti && binario == treno.binario;
    }
    public boolean partePrima(Treno treno1){
        treno1 = new Treno();
        if(ore == treno1.ore && minuti == treno1.minuti)
            return false;
        else if(ore == treno1.ore && treno1.minuti < minuti)
            return true;
        else if(minuti == treno1.minuti && treno1.ore < ore)
            return true;
        else if(ore > treno1.ore && minuti > treno1.minuti)
            return false;
        else if(ore < treno1.ore && minuti < treno1.minuti)
            return true;
        return false;
    }
}