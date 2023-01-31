package day9;

public class Student extends Human  {
    private String name;
    private String groupName;

    @Override
    public String getName() {
        return name;
    }

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        this.name = name;
        this.groupName = groupName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + getName());
    }
}
