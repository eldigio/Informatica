package Student;

public class Student {
    private static int totale, punti;
    private String nome;

    public Student(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addQuiz(int score) {
        totale += score;
        punti = score;
    }

    public int getPunti() {
        return punti;
    }

    public int getTotalScore() {
        return totale;
    }

    public float getAverage() {
        return (float) totale / 20;
    }

    public void stampa() {
        System.out.println("Nome: " + getNome() + " Punti: " + getPunti());
    }
}