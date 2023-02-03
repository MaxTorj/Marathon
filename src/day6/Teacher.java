package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int rating = random.nextInt(2,6); //random.nextInt(4) + 2;

        String evaluation = switch (rating) {
            case 2 -> "неудовлетворительно";
            case 3 -> "удовлетворительно";
            case 4 -> "хорошо";
            case 5 -> "отлично";
            default -> "";
        };

        System.out.println(this.name + " оценил студента по имени " + student.getName() + " по предмету "
                         + this.subject + " " + evaluation);

//        if (rating == 2) {
//            System.out.println(this.name + " оценил студента по имени " + student.getName() + " по предмету "
//                             + this.subject + " на оценку неудовлетворительно");
//        } else if (rating == 3) {
//            System.out.println(this.name + " оценил студента по имени " + student.getName() + " по предмету "
//                             + this.subject + " на оценку удовлетворительно");
//        } else if (rating == 4) {
//            System.out.println(this.name + " оценил студента по имени " + student.getName() + " по предмету "
//                             + this.subject + " на оценку хорошо");
//        } else {
//            System.out.println(this.name + " оценил студента по имени " + student.getName() + " по предмету "
//                             + this.subject + " на оценку отлично");
//        }
    }
}
