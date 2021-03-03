package Vector;

import java.util.Vector;

public class VectorMain {
    public static void main(String[] args) {
        Vector v = new Vector();
        Articolo articolo = new Articolo("a");
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        for (Object elem : v) {
            System.out.println(elem + " ");
        }
        System.out.println(v);
        v.remove(2);
        System.out.println(v);
    }
}
