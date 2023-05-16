package com.thuanfpt.nhanvien;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    private String code;
    private String firstName;
    private String lastName;
    private String department;
    private double salary;
    private double commissionRate;
    private double income;
    private double incomeTax;

    public Employee(String code, String firstName, String lastName, String department, double salary, double commissionRate) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.commissionRate = commissionRate;
        this.income = 0;
        this.incomeTax = 0;
    }

    public String getCode() {
        return code;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getIncome() {
        return income;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public void calculateIncome(double totalRevenue) {
        if (department.equals("Administrative")) {
            income = salary;
        } else if (department.equals("Marketing")) {
            income = salary + commissionRate * totalRevenue;
        } else if (department.equals("Chief")) {
            income = salary;
        }
        calculateIncomeTax();
    }

    public void calculateIncomeTax() {
        if (income < 9000000) {
            incomeTax = 0;
        } else if (income < 15000000) {
            incomeTax = 0.1 * (income - 9000000);
        } else {
            incomeTax = 0.1 * (15000000 - 9000000) + 0.12 * (income - 15000000);
        }
    }

    public String toString() {
        return code + ", " + lastName + " " + firstName + ", " + department + ", " + String.format("%.2f", income) + ", " + String.format("%.2f", incomeTax);
    }
}

public class PayrollManagementSystem {
    private ArrayList<Employee> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PayrollManagementSystem system = new PayrollManagementSystem();
        system.run();
    }

    public void run() {
        while (true) {
            System.out.println("\n=== Payroll Management System ===");
            System.out.println("1. Enter employee list");
            System.out.println("2. Export employee list");
            System.out.println("3. Search employee by code");
            System.out.println("4. Delete employee by code");
            System.out.println("5. Update employee information by code");
            System.out.println("6. Find employees by salary range");
            System.out.println("7. Sort employees by name");
            System.out.println("8. Sort employees by income");
            System.out.println("9. Export 5 employees with highest income");
            System.out.println("0. Exit");

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    enterEmployeeList();
                    break;
                case 2:
exportEmployeeList();
break;
case 3:
searchEmployeeByCode();
break;
case 4:
deleteEmployeeByCode();
break;
case 5:
updateEmployeeByCode();
break;
case 6:
findEmployeesBySalaryRange();
break;
case 7:
sortEmployeesByName();
break;
case 8:
sortEmployeesByIncome();
break;
case 9:
exportTop5Employees();
break;
case 0:
System.out.println("Goodbye!");
return;
default:
System.out.println("Invalid choice.");
}
}
}
    private void enterEmployeeList() {
    int numEmployees = readInt("Enter number of employees: ");

    for (int i = 0; i < numEmployees; i++) {
        String code = readString("Enter code: ");
        String firstName = readString("Enter first name: ");
        String lastName = readString("Enter last name: ");
        String department = readString("Enter department (Administrative/Marketing/Chief): ");
        double salary = readDouble("Enter salary: ");

        double commissionRate = 0;
        if (department.equals("Marketing")) {
            commissionRate = readDouble("Enter commission rate: ");
        }

        employees.add(new Employee(code, firstName, lastName, department, salary, commissionRate));
    }
}

private void exportEmployeeList() {
    System.out.println("Code, Name, Department, Income, Income Tax");

    for (Employee employee : employees) {
        System.out.println(employee.toString());
    }
}

private void searchEmployeeByCode() {
    String code = readString("Enter code: ");

    for (Employee employee : employees) {
        if (employee.getCode().equals(code)) {
            System.out.println(employee.toString());
            return;
        }
    }

    System.out.println("Employee not found.");
}

private void deleteEmployeeByCode() {
    String code = readString("Enter code: ");

    for (Employee employee : employees) {
        if (employee.getCode().equals(code)) {
            employees.remove(employee);
            System.out.println("Employee deleted.");
            return; // break out of the loop
        }
    }

    System.out.println("Employee not found.");
}


private void updateEmployeeByCode() {
    String code = readString("Enter code: ");

    for (Employee employee : employees) {
        if (employee.getCode().equals(code)) {
            String firstName = readString("Enter first name: ");
            String lastName = readString("Enter last name: ");
            String department = readString("Enter department (Administrative/Marketing/Chief): ");
            double salary = readDouble("Enter salary: ");

            double commissionRate = 0;
            if (department.equals("Marketing")) {
                commissionRate = readDouble("Enter commission rate: ");
            }

            employee.setSalary(salary);
            employee.setCommissionRate(commissionRate);
            employee.calculateIncome(0); // Recalculate income and tax
            System.out.println("Employee updated.");
            return;
        }
    }

    System.out.println("Employee not found.");
}

private void findEmployeesBySalaryRange() {
    double minSalary = readDouble("Enter minimum salary: ");
    double maxSalary = readDouble("Enter maximum salary: ");

    for (Employee employee : employees) {
        if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
            System.out.println(employee.toString());
        }
    }
}

private void sortEmployeesByName() {
    Comparator<Employee> byName = Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName);
    Collections.sort(employees, byName);
exportEmployeeList();
}
private void sortEmployeesByIncome() {
    Comparator<Employee> byIncome = Comparator.comparing(Employee::getIncome).reversed();
    Collections.sort(employees, byIncome);
    exportEmployeeList();
}

private void exportTop5Employees() {
    Comparator<Employee> byIncome = Comparator.comparing(Employee::getIncome).reversed();
    List<Employee> top5Employees = employees.stream().sorted(byIncome).limit(5).collect(Collectors.toList());

    System.out.println("Code, Name, Department, Income, Income Tax");

    for (Employee employee : top5Employees) {
        System.out.println(employee.toString());
    }
}

private int readInt(String prompt) {
    System.out.print(prompt);
    while (!scanner.hasNextInt()) {
        scanner.nextLine(); // Clear input buffer
        System.out.print("Invalid input. " + prompt);
    }
    int input = scanner.nextInt();
    scanner.nextLine(); // Clear input buffer
    return input;
}

private double readDouble(String prompt) {
    System.out.print(prompt);
    while (!scanner.hasNextDouble()) {
        scanner.nextLine(); // Clear input buffer
        System.out.print("Invalid input. " + prompt);
    }
    double input = scanner.nextDouble();
    scanner.nextLine(); // Clear input buffer
    return input;
}

private String readString(String prompt) {
    System.out.print(prompt);
    return scanner.nextLine();
}
}

public class Employee {
private String code;
private String firstName;
private String lastName;
private String department;
private double salary;
private double commissionRate;
private double income;
private double incomeTax;
public Employee(String code, String firstName, String lastName, String department, double salary, double commissionRate) {
    this.code = code;
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
    this.salary = salary;
    this.commissionRate = commissionRate;

    calculateIncomeTax();
    calculateIncome(0); // Initial calculation of income
}

public String getCode() {
    return code;
}

public String getFirstName() {
    return firstName;
}

public String getLastName() {
    return lastName;
}

public String getDepartment() {
    return department;
}

public double getSalary() {
    return salary;
}

public double getCommissionRate() {
    return commissionRate;
}

public void setSalary(double salary) {
    this.salary = salary;
}

public void setCommissionRate(double commissionRate) {
    this.commissionRate = commissionRate;
}

public double getIncome() {
    return income;
}

public double getIncomeTax() {
    return incomeTax;
}

public void calculateIncome(double bonus) {
    double sales = 0;
    if (department.equals("Marketing")) {
        sales = readDouble("Enter total sales: ");
    }

    income = salary + bonus + (sales * commissionRate);
    calculateIncomeTax();
}

private void calculateIncomeTax() {
    if (income <= 9000000) {
        incomeTax = 0;
    } else if (income <= 15000000) {
        incomeTax = 0.1 * (income - 9000000);
    } else {
        incomeTax = 0.1 * (15000000 - 9000000) + 0.12 * (income - 15000000);
    }
}

@Override
public String toString() {
    return code + ", " + firstName + " " + lastName + ", " + department + ", " + income + ", " +incomeTax;
}
}

public class AdministrativeEmployee extends Employee {
public AdministrativeEmployee(String code, String firstName, String lastName, String department, double salary, double commissionRate) {
super(code, firstName, lastName, department, salary, commissionRate);
}
}

public class MarketingEmployee extends Employee {
public MarketingEmployee(String code, String firstName, String lastName, String department, double salary, double commissionRate) {
super(code, firstName, lastName, department, salary, commissionRate);
}
}

public class ChiefEmployee extends Employee {
public ChiefEmployee(String code, String firstName, String lastName, String department, double salary, double commissionRate) {
super(code, firstName, lastName, department, salary, commissionRate);
}
@Override
public void calculateIncome(double bonus) {
    double totalRevenue = readDouble("Enter total revenue: ");
    double sales = 0;
    if (department.equals("Marketing")) {
        sales = readDouble("Enter total sales: ");
    }

    income = salary + bonus + (totalRevenue * 0.01) + (sales * commissionRate);
    calculateIncomeTax();
}
}

public class PayrollManagementSystem {
public static void main(String[] args) {
PayrollSystem payrollSystem = new PayrollSystem();
payrollSystem.run();
}
}


