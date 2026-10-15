
class Employee {
    int empid;
    String name;
    double salary;

    void display() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Main {
    public static void main(String[] args) {
        Employee A = new Employee();

        A.empid = 101;
        A.name = "Ravi";
        A.salary = 25000;

        A.display();
    }
}
