public class ArraynonRipetuto {
    public static void main(String[] args) {
        int v[] = new int[20];
        System.out.println("Array randomizzato:");
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 10);
            System.out.print(v[i] + "\t");
        }
        System.out.println("\n\nArray modificato:");
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                if (v[i] == v[j]) {
                    v[j] = 0;
                }
            }
            System.out.print(v[i] + "\t");
        }
        System.out.println("\n\nArray con i valori non ripetuti:");
        for (int i = 0; i < v.length; i++) {
            if (v[i] != 0)
                System.out.print(v[i] + " ");
        }
    }
}
