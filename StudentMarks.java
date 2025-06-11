public class StudentMarks {
    String name;
    int mark1, mark2, mark3;

    StudentMarks(String name, int m1, int m2, int m3) {
        this.name = name;
        this.mark1 = m1;
        this.mark2 = m2;
        this.mark3 = m3;
    }

    void calculateAverage() {
        int total = mark1 + mark2 + mark3;
        double average = total / 3.0;
        System.out.println("Student: " + name + ", Average Marks: " + average);
    }

    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks("Ram", 80, 85, 90);
        sm.calculateAverage();
    }
}

