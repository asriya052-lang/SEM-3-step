package oop.class_problems;

public class Employee {

    String empId;
    String empName;
    double salary;

    public Employee(String empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public void printSalary() {
        System.out.println(empId + " | Final Salary: Rs " + this.salary);
    }

    public static void main(String[] args) {

        Employee[] employees = {
                new Employee("E-101", "Ravi", 40000),
                new Employee("E-102", "Meera", 55000),
                new Employee("E-103", "Karthik", 62000),
                new Employee("E-104", "Divya", 48000)
        };

        for (Employee employee : employees) {
            employee.raiseSalary(5000);
            employee.printSalary();
        }
    }
}