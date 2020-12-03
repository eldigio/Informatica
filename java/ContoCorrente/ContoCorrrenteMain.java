package ContoCorrente;

public class ContoCorrrenteMain {
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente((int) (Math.random() * 99999) + 1);
        conto.setSaldo((float) (Math.floor(Math.random() * 999) + 100)/100);
        System.out.println("Es-1\nCodice del conto corente: " + conto.getCodiceConto());
        conto.stampa();
        float random = (float) (Math.floor(Math.random() * 999) + 100) / 100;
        conto.versamento(random);
        System.out.println("Versamento: " + random);
        conto.stampa();
        random = (float) (Math.floor(Math.random() * 999) + 100) / 100;
        conto.prelievo(random);
        System.out.println("Prelievo: " + random);
        conto.stampa();

        ContoCorrente conti = new ContoCorrente((int) (Math.random() * 99999) + 1);
        System.out.println("Es-2\nCodice del conto corrente: " + conti.getCodiceConto());
        conti.setSaldo((float) (Math.floor(Math.random() * 999) + 100) / 100);
        conti.stampa();
        for (int i = 0; i < 2; i++) {
            random = (float) (Math.floor(Math.random() * 999) + 100) / 100;
            conti.versamenti(random, i);
            System.out.println("Versamento: " + random);
            conti.stampe(i);
            random = (float) (Math.floor(Math.random() * 999) + 100) / 100;
            conti.prelievi(random, i);
            System.out.println("Prelievo: " + random);
            conti.stampe(i);
        }
    }
}
