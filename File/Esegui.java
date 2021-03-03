package File;

import java.io.*;
import java.util.*;

public class Esegui {
    public static void main(String[] args) throws IOException {
        String nome, cognome;
        Studente studente = new Studente("", "");
        FileReader reader = new FileReader("D:\\Informatica\\Java\\src\\main\\java\\File\\nomi.txt");
        Scanner in = new Scanner(reader);
        PrintWriter out = new PrintWriter("D:\\Informatica\\Java\\src\\main\\java\\File\\output_nomi.txt");
        Vector v = new Vector();
        while (in.hasNextLine()) {
            String riga = in.nextLine();
            Scanner t = new Scanner(riga);
            while (t.hasNext()) {
                nome = t.next();
                cognome = t.next();
                studente = new Studente(nome, cognome);
            }
            v.add(studente);
            out.println(studente);
        }
        reader.close();
        out.close();
        System.out.println(v.toString());
    }
}
