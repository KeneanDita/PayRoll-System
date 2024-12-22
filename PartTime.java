package payrollsystem;

public class PartTime extends Employee {
    private double rate;
    private double hoursWorked;

    public PartTime(int id, String name, double rate, double hoursWorked2) {
        super(id, name);
        this.rate = rate;
        this.hoursWorked = hoursWorked2;
    }
    public double calculatePay() {
        double grossPay = this.getHoursWorked() * this.getRate();
        double tax = grossPay * 0.1;
        return grossPay - tax;
    }
    public double getRate() {
        return rate;
    }
    public double getHoursWorked() {
        return hoursWorked;
    }
}
