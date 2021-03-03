public class PrimaRicerca {
    public static void main(String[] args) {
        int v[] = new int[30], pos = 0;
        boolean ok = false;
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100);
            if (v[i] == 50) {
                ok = true;
                pos = i;
            }
            System.out.print(v[i] + " ");
        }
        System.out.println();
        if (ok) {
            System.out.println("Ho trovato il numero 50 in posizione: " + pos);
        } else {
            System.out.println("Non ho trovano il numero 50!");
        }
    }
}
