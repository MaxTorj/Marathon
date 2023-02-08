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
        int rating = random.nextInt(4) + 2; //random.nextInt(4) + 2;

        String evaluation = "";
        switch (rating) {
            case 2:
                evaluation = "неудовлетворительно";
                break;

            case 3:
                evaluation = "удовлетворительно";
                break;

            case 4:
                evaluation = "хорошо";
                break;

            case 5:
                evaluation = "отлично";
                break;

            default:
                System.out.println("некорректная оценка");
        }

        System.out.println(this.name + " оценил студента по имени " + student.getName() + " по предмету "
                         + this.subject + " на оценку " + evaluation);
    }
}
