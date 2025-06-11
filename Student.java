public class Student {
    static String schoolName = "ABC School";
    String studentName;

    Student(String name) {
        this.studentName = name;
    }

    void display() {
        System.out.println(studentName + " studies at " + schoolName);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ram");
        Student s2 = new Student("Sam");
        s1.display();
        s2.display();
    }
}

