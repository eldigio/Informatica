package CD;

class CD {
    private String[] titolo;  //titolo della canzone
    private int[] minuti, secondi;    //durata

    public CD(String[] titolo, int[] minuti, int[] secondi) {
        this.titolo = titolo;
        this.minuti = minuti;
        this.secondi = secondi;
    }

    public int getDurata(String title) {
        String s = titolo[0];
        boolean ok = false;
        int i = 0;
        for (i = 0; ok; i++) {
            if (s.equals(titolo[i]))
                ok = true;
            else
                s = titolo[i + 1];
        }
        if(ok = false)
            return 0;
        return i;
    }

    public void stampa() {
        for (int i = 0; i < titolo.length; i++) {
            System.out.println("Titolo: " + titolo[i] + "\tdurata: " + minuti[i] + ":" + secondi[i]);
        }
    }
}
