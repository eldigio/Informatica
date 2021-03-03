package File;

import java.io.*;
import java.util.Scanner;

public class ContaRighe {
    public static void main(String[] args) throws IOException {
        int numRighe = 0;
        try {
            FileReader reader = new FileReader("D:\\Informatica\\Java\\src\\main\\java\\File\\input.txt");
            Scanner in = new Scanner(reader);
            PrintWriter out = new PrintWriter("D:\\Informatica\\Java\\src\\main\\java\\File\\output1.txt");
            int cont = 0;
            while (in.hasNextLine()) {
                String rigain = in.nextLine();
                System.out.println("Num.Riga: " + numRighe + " - " + rigain);
                numRighe++;
                cont++;
            }
            out.println("Numero di righe: " + cont);
            reader.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File non trovato!");
        }
    }
}
