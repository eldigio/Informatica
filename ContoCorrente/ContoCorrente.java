package ContoCorrente;

public class ContoCorrente {
    private int codiceConto;
    private float saldo;
    private float[] conto;

    public ContoCorrente(int codiceConto) {
        this.conto = new float[5];
        this.codiceConto = codiceConto;
    }

    public int getCodiceConto() {
        return codiceConto;
    }

    public void setSaldo(float sal) {
        this.saldo = sal;
        conto[0] = this.saldo;
    }

    public void versamento(float ver) {
        this.saldo += ver;
    }

    public void prelievo(float pre) {
        this.saldo -= pre;
    }

    public void versamenti(float ver, int i) {
        conto[i + 1] = conto[i] + ver;
        //System.out.println(conto[i+1]);
    }

    public void prelievi(float pre, int i) {
        conto[i + 1] = conto[i] - pre;
        //System.out.println(conto[i+1]);
    }

    public void stampa() {
        System.out.println("Il saldo è: " + Math.floor(saldo * 100) / 100);
    }

    public void stampe(int i) {
        System.out.println("Il saldo è: " + Math.floor(conto[i + 1] * 100) / 100);
    }
}
