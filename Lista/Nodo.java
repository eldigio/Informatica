package Lista;

public class Nodo {
    private String info;
    private Nodo link;

    public Nodo(String s){
        info = s;
        link = null;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setLink(Nodo link) {
        this.link = link;
    }

    public String getInfo() {
        return info;
    }

    public Nodo getLink() {
        return link;
    }
}
