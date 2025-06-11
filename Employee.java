public class Employee {
    int empId;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(1, "Ram", 50000);
        emp.displayDetails();
    }
}

