package File;

import java.io.*;
import java.util.Scanner;

public class ContaParole {
    public static void main(String[] args) throws IOException {
        int cont = 0;
        try {
            FileReader reader = new FileReader("D:\\Informatica\\Java\\src\\main\\java\\File\\input.txt");
            Scanner in = new Scanner(reader);
            PrintWriter out = new PrintWriter("D:\\Informatica\\Java\\src\\main\\java\\File\\output2.txt");
            while (in.hasNext()) {
                in.next();
                cont++;
            }
            out.println("Numero di parole: " + cont);
            reader.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato!");
        }
    }
}
