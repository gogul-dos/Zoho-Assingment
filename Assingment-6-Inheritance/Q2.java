class StudentParent {
    String name;
    int age;

    public StudentParent(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parent Constructor: Name - " + name + ", Age - " + age);
    }
}

class ZSGSStudent extends StudentParent {
    String course;

    public ZSGSStudent(String name, int age, String course) {
        super(name, age);
        this.course = course;
        System.out.println("Child Constructor: Course - " + course);
    }
}

public class Q2 {
    public static void main(String[] args) {
        ZSGSStudent student = new ZSGSStudent("John", 20, "Computer Science");
    }
}
