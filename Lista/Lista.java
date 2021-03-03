package Lista;

public class Lista {
    private Nodo head;
    private int size;

    public Lista() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void visitaLista() {
        Nodo p = head;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getLink();
        }
    }

    public void inserisciInTesta(Nodo element) {
        Nodo pn = element;
        pn.setLink(head);
        head = pn;
        size++;
    }

    public void inserisciInCoda(Nodo element) {
        Nodo p = head;
        Nodo pn = element;
        if (p == null) {
            inserisciInTesta(element);
        } else {
            while (p.getLink() != null) {
                p = p.getLink();
            }
            pn.setLink(null);
            p.setLink(pn);
            size++;
        }
    }

    public void inserisciInPos(Nodo element, int pos) {
        Nodo p = head;
        Nodo pn = element;
        int i = 0;
        if ((pos <= 1) || (head == null)) {
            inserisciInCoda(pn);
        } else if (pos > size) {
            inserisciInCoda(pn);
        } else {
            while (i < pos-1) {
                p = p.getLink();
                i++;
            }
        }
        pn.setLink(p.getLink());
        p.setLink(pn);
        size++;
    }

    public void eliminaInTesta() {
        if (head == null) {
            return;
        }
        head = head.getLink();
        size--;
    }

    public void eliminaInCoda() {
        Nodo ps = head, pp = head;
        if (pp == null) {
            return;
        }
        while (ps.getLink() != null) {
            pp = ps;
            ps = ps.getLink();
        }
        if (pp == head) {
            eliminaInTesta();
        } else {
            pp.setLink(null);
            size--;
        }
    }
    public void eliminaInPos(int pos){
        Nodo pp, ps;
    }
}
