package Studente;

public class Student {
    private int score;
    private int quiz[];
    private String nome;

    public Student(String nome, int quiz) {
        this.nome = nome;
        this.quiz = new int[quiz];
    }

    public void addScore(int score, int i) {
        this.score = score;
        quiz[i] = this.score;
    }

    public int getTotalScore() {
        int total = 0;
        for (int i = 0; i < quiz.length; i++) {
            total += quiz[i];
        }
        return total;
    }

    public int getAverage() {
        return getTotalScore() / quiz.length;
    }
}
