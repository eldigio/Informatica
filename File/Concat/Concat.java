package File.Concat;

import java.io.*;
import java.util.Scanner;

public class Concat {
    public static void concat(String[] inFiles, String outFile) throws IOException {
        String ris = "";
        for (int i = 0; i < inFiles.length; i++) {
            FileReader file = null;
            Scanner in = null;
            file = new FileReader(inFiles[i]);
            in = new Scanner(file);
            String s = in.nextLine();
            while (in.hasNextLine()) {
                s = in.nextLine();
                ris += s;
            }
            PrintWriter out = null;
            out = new PrintWriter(outFile);
            System.out.println(ris);
            out.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String[] s = new String[2];
        s[0] = "input.txt";
        s[1] = "input.txt";
        String write = "output.txt";
        concat(s, write);
    }
}
