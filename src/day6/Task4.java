package day6;

public class Task4 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петрович", "труды");
        Teacher teacher1 = new Teacher("Василич", "физ-ра");
        Student student = new Student();
        student.setName("Вася");
        teacher.evaluate(student);
        Student student1 = new Student();
        student1.setName("Олег");
        teacher1.evaluate(student1);
    }
}
