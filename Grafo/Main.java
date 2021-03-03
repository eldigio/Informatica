package Grafo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] grafo = {{0, 0}, {0, 0}};
        int visited[] = new int[grafo.length];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(grafo[i][j]);
            }
            System.out.println();
        }
        Grafo grafo1 = new Grafo();
        System.out.println(grafo1.connesso(grafo, grafo[0][0], grafo[grafo.length][grafo.length], visited));
    }
}
