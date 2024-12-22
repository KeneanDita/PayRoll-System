package payrollsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        ArrayList<Employee> arrEmp = new ArrayList<Employee>();
        byte menuOption = 0;
        do {
            menuOption = showMenu();
            switch (menuOption) {
                case 1:
                    FullTime ft = readNewFullTime();
                    addEmployee(arrEmp, ft);
                    break;
                case 2:
                    PartTime pt = readNewPartTime();
                    addEmployee(arrEmp, pt);
                    break;
                case 3:
                    generateReport(arrEmp);
                    break;
            }
        } while (menuOption != 0);
    }
    public static byte showMenu() {
        System.out.println("Courses of Actions:-");
        System.out.println("1. Add Full-Time Employee");
        System.out.println("2. Add Part-Time Employee");
        System.out.println("3. Generate Payroll Report");
        System.out.println("0. Exit");
        System.out.print("Enter your choice of action: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextByte();
    }
    public static FullTime readNewFullTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter Overtime Pay: ");
        double overtime = sc.nextDouble();
        return new FullTime(id, name, salary, overtime);
    }
    public static PartTime readNewPartTime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Full Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Hourly Rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Hours Worked: ");
        double hoursWorked = sc.nextDouble();
        return new PartTime(id, name, rate, hoursWorked);
    }
    public static void addEmployee(ArrayList<Employee> empList, Employee emp) {
        empList.add(emp);
    }
    public static void generateReport(ArrayList<Employee> empList) {
        System.out.println("Payroll Report:");
        for (Employee emp : empList) {
            System.out.println("----- Employee Information --------");
            System.out.println(" ID: " + emp.getEmpId());
            System.out.println(" Name: " + emp.getName());
            System.out.println(" Net Pay: " + emp.calculatePay());
            System.out.println("***************************************");
        }
    }
}
