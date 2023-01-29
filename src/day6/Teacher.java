package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void evaluate(Student student) {
        Random random = new Random();
        int rating = random.nextInt(2,6);
        if (rating == 2) {
            System.out.println(name + " оценил студента по имени  " + student.getName() + " по предмету " + subject +
                    " на оценку неудовлетворительно");
        } else if (rating == 3) {
            System.out.println(name + " оценил студента по имени " + student.getName() + " по предмету " + subject +
                    " на оценку удовлетворительно");
        } else if (rating == 4) {
            System.out.println(name + " оценил студента по имени " + student.getName() + " по предмету " + subject +
                    " на оценку хорошо");
        } else {
            System.out.println(name + " оценил студента по имени " + student.getName() + " по предмету " + subject +
                    " на оценку отлично");
        }
    }
}
