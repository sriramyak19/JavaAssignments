public class EmployeeWithSalary {
    int empId;
    String name;
    double salary;
    static int totalEmployees = 0;
    static double totalSalaryExpense = 0;

    EmployeeWithSalary(int id, String name, double salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
        totalEmployees++;
        totalSalaryExpense += salary;
    }

    void displaySalaryInfo() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }

    static void displayTotalExpense() {
        System.out.println("Total Employees: " + totalEmployees + ", Total Salary Expense: " + totalSalaryExpense);
    }

    public static void main(String[] args) {
        EmployeeWithSalary e1 = new EmployeeWithSalary(1, "Ram", 60000);
        EmployeeWithSalary e2 = new EmployeeWithSalary(2, "Sam", 70000);
        e1.displaySalaryInfo();
        e2.displaySalaryInfo();
        EmployeeWithSalary.displayTotalExpense();
    }
}

