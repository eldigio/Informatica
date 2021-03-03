package Grafo;

public class Grafo {
    public Grafo() {
    }

    public boolean connesso(int[][] graph, int start, int end, int visited[]) {
        visited[start] = 1;
        if (graph[start][end] == 1) {
            System.out.println("Connesso");
            return true;
        }
        for (int i = 0; i < graph[0].length; i++) {
            if (graph[start][i] == 1 && visited[i] == 0) {
                visited[i] = 1;
                if(connesso(graph, i, end, visited))
                    return true;
            }
        }
        return false;
    }
}
