package Studente;

public class StudentMain {
    public static void main(String[] args) {
        Student[] student = new Student[20];
        for (int i = 0; i < student.length; i++) {
            student[i] = new Student("nome" + i, (int) (Math.random() * 9) + 1);

        }
    }
}
