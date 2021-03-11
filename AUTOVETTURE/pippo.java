package AUTOVETTURE;

import java.io.*;
import java.util.*;

public class pippo {
    public static void main(String[] args) {
        String marca, numTelaio, modello, area;
        float pesoAvuoto, volumeSerbatoio;
        boolean alimentazioneAgas;
        Automobile auto = new Automobile();
        Vector v = new Vector();
        try {
            FileReader reader = new FileReader("D:\\Informatica\\Java\\src\\main\\java\\AUTOVETTURE\\input.txt");
            Scanner in = new Scanner(reader);
            while (in.hasNextLine()) {
                String s = in.nextLine();
                Scanner in1 = new Scanner(s);
                while (in1.hasNext()) {
                    marca = in1.next();
                    numTelaio = in1.next();
                    modello = in1.next();
                    area = in1.next();
                    pesoAvuoto = in1.nextFloat();
                    volumeSerbatoio = in1.nextFloat();
                    alimentazioneAgas = in1.nextBoolean();
                    auto = new Automobile(marca, numTelaio, modello, area, pesoAvuoto, volumeSerbatoio, alimentazioneAgas);
                }
                v.add(auto);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        System.out.println(v.toString());
    }
}
