public class Random19 {
    public static void main(String[] args) {
        int v[] = new int[5];
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 90);
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
        }
    }
}
