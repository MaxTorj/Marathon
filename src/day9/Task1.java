package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Максим", "Программирование");
        Teacher teacher = new Teacher("Иван Васильевич", "История");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
