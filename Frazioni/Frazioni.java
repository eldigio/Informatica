package Frazioni;

public class Frazioni {
    private int num, den;

    public Frazioni() {
        this(0, 0);
    }

    public Frazioni(int n, int d) {
        this.num = n;
        this.den = d;
    }

    public int mcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return mcd(a, a % b);
    }

    public int mcm(Frazioni frazione1, Frazioni frazione2) {
        if ((frazione1.num * frazione1.den) / (mcd(frazione1.num, frazione1.den)) > (frazione2.num * frazione2.den) / (mcd(frazione2.num, frazione2.den)))
            return (frazione1.num * frazione1.den) / (mcd(frazione1.num, frazione1.den));
        else
            return (frazione2.num * frazione2.den) / (mcd(frazione2.num, frazione2.den));
    }

    public void simplify() {
        int mcd = mcd(num, den);
        if(mcd == 1)
            return;
        else{
            num /= mcd;
            den /= mcd;
        }
    }

    /*public void somma(Frazioni frazione1, Frazioni frazione2) {
        System.out.println((frazione1.num + frazione2.num) + "/" + mcd(frazione1.den, frazione2.den));
    }*/
    public Frazioni somma(Frazioni frazione){
        int n = num * frazione.den + frazione.num * den;
        int d = den * frazione.den;
        return new Frazioni(n, d);
    }

    public void print() {
        System.out.println(num + "/" + den);
    }
}
