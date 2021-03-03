package File;

import java.io.*;
import java.util.Scanner;

public class CopiaFile {
    public static void main(String[] args) throws Exception {
        String nomeFile;
        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci il nome del file: ");
        nomeFile = in.next();
        FileReader reader = new FileReader("D:\\Informatica\\Java\\src\\main\\java\\File\\" + nomeFile + ".txt");
        FileWriter writer = new FileWriter("D:\\Informatica\\Java\\src\\main\\java\\File\\output3.txt");
        PrintWriter out = new PrintWriter(writer);
        Scanner t = new Scanner(reader);
        while(t.hasNextLine()){
            String s = t.nextLine();
            out.println(s);
        }
        reader.close();
        out.close();
    }
}
