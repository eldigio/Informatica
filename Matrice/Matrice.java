package Matrice;

class Matrice {
    private String[][] mat;     //attributo

    public Matrice(String[][] mat) {    //costruttore
        this.mat = mat;
    }
        //metodo diagonale
    public String[] diagonale(int k) {
        String[] v = new String[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (i == j && mat[i][j].length() < k) {
                    v[i] = mat[i][j];
                }
            }
        }
        return v;
    }
}