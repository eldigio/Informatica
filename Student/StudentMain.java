package Student;

public class StudentMain {
    public static void main(String[] args) {
        Student[] student = new Student[20];
        int totale = 0;
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student("nome" + i);
            int score = (int) (Math.random() * 9) + 1;
            totale += score;
            student[i].addQuiz(score);
            student[i].stampa();
        }
        System.out.println("Il totale dei punti è: " + student[student.length - 1].getTotalScore() + "\nLa media è: " + student[student.length - 1].getAverage());
    }
}