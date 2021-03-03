import java.io.*;
public class prova {
    public static void main (String args[]) {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        String nome;
        try {
            nome = tastiera.readLine();
        }
        catch (Exception e) {
            System.out.println("\nHai inserito dei valori non corretti");
            return;
        }
        System.out.println("\nBenvenuto " + nome + " nella programmazione java");
        
    }
}