package payrollsystem;

public class FullTime extends Employee {
    private double salary;
    private double overtime;

    public FullTime(int id, String name, double sal, double hourAndHalf) {
        super(id, name);
        this.overtime = hourAndHalf;
        this.salary = sal;
    }
    public double calculatePay() {
        double grossPay = this.getSalary() + this.getOvertime();
        double tax = grossPay * 0.1;
        return grossPay - tax;
    }
    public double getSalary() {
        return salary;
    }
    public double getOvertime() {
        return overtime;
    }
}
