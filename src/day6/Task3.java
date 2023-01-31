package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петрович", "труды");
        Teacher teacher1 = new Teacher("Василич", "физ-ра");

        Student student = new Student("Вася");
        teacher.evaluate(student);

        Student student1 = new Student("Олег");
        teacher1.evaluate(student1);
    }
}
