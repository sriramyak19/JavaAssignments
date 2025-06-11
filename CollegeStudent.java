public class CollegeStudent {
    int studentId;
    String studentName;
    static String collegeName = "XYZ College";

    CollegeStudent(int id, String name) {
        this.studentId = id;
        this.studentName = name;
    }

    void display() {
        System.out.println("ID: " + studentId + ", Name: " + studentName + ", College: " + collegeName);
    }

    public static void main(String[] args) {
        CollegeStudent cs1 = new CollegeStudent(201, "Ram");
        CollegeStudent cs2 = new CollegeStudent(202, "Sam");
        cs1.display();
        cs2.display();
    }
}

