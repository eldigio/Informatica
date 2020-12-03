package Dipendente;

public class ProgDipendente {
    public static void main(String[] args) {
        Dipendente[] dipendenti = new Dipendente[10];
        for (int i = 0; i < 10; i++) {
            dipendenti[i] = new Dipendente("nome" + i, (int) (Math.random() * 2000));
            System.out.println("Dipendente" + (i + 1) + ": " + dipendenti[i].getNome() + "   Stipendio: " + dipendenti[i].getStipendio());
        }
        int n = (int) (Math.random() * 10);
        int byPercent = (int) (Math.random() * 100);
        System.out.println("Dipendente" + n + ": " + dipendenti[n].getNome() + "   Stipendio: " + dipendenti[n].getStipendio() + " + " + byPercent + "%");
        dipendenti[n].raiseSalary(byPercent);
        System.out.println("Dipendente" + n + ": " + dipendenti[n].getNome() + "   Stipendio: " + dipendenti[n].getStipendio());
    }
}
