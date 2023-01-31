package day9;

public class Teacher extends Human {
    private String name;
    private String subjectName;

    @Override
    public String getName() {
        return name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public Teacher(String name, String subjectName) {
        this.name = name;
        this.subjectName = subjectName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
