package Persona;

public class Data {
    private int gg, mm, aaaa;

    public Data(int gg, int mm, int aaaa) {
        this.gg = gg;
        this.mm = mm;
        this.aaaa = aaaa;
    }

    public Data() {
        this(22, 5, 2020);
    }

    public void setGg(int gg) {
        this.gg = gg;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public void setAaaa(int aaaa) {
        this.aaaa = aaaa;
    }

    public int getGg() {
        return gg;
    }

    public int getMm() {
        return mm;
    }

    public int getAaaa() {
        return aaaa;
    }

    public String getData(){
        return getGg()+"/"+getMm()+"/"+getAaaa();
    }
}
