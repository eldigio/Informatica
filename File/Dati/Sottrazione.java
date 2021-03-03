package File.Dati;

import java.io.*;
import java.util.*;

public class Sottrazione {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("D:\\Informatica\\Java\\src\\main\\java\\File\\Dati\\dati.txt");
        Scanner in = new Scanner(reader);
        FileWriter out = new FileWriter("D:\\Informatica\\Java\\src\\main\\java\\File\\Dati\\dati.txt", true);
        Vector num = new Vector();
        out.write("\n");
        while (in.hasNextLine()) {
            String s = in.nextLine();
            Scanner in1 = new Scanner(s);
            while (in1.hasNextInt()) {
                num.add(in1.nextInt());
                out.write("-");
            }
        }
        reader.close();
        out.write("\n");
        for (int i = 0; i < num.size() / 2; i++) {
            out.write(((int) num.get(i)) - ((int) num.get((num.size() / 2) + i)) + " ");
        }
        out.close();
    }
}
