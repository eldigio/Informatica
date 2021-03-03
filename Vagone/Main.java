package Vagone;

public class Main {
    public static void main(String[] args) {
        VagoneMerci merci = new VagoneMerci();
        merci.setCodice("05");
        merci.setPesoVuoto(2);  //tonnellate
        merci.setAziendaCostruttrice("Freccia Rossa");
        merci.setAnnoCostruzione(2018);
        merci.setVolumeCarico(2);   //tonnellate
        merci.setPesoMaxCarico(5);  //tonnellate
        merci.setPesoEffCarico(2);  //tonnellate
        merci.print();
        VagonePasseggeri passeggeri = new VagonePasseggeri();
        passeggeri.setCodice("06");
        passeggeri.setPesoVuoto(1);  //tonnellate
        passeggeri.setAziendaCostruttrice("Freccia Rossa");
        passeggeri.setAnnoCostruzione(2018);
        passeggeri.setClasse(2);
        passeggeri.setPostiDisponibili(520);
        passeggeri.setPostiOccupati(500);
        passeggeri.setPesoOccupante(65);
        passeggeri.print();
    }
}
