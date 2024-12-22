package payrollsystem;

public abstract class Employee {
    private int empId;
    private String name;

    public Employee() {
        System.out.println("Information Stored Successfully");
        empId = 0;
        name = "";
    }
    public Employee(int pEmpId, String pName) {
        System.out.println("Information Stored Successfully");
        empId = pEmpId;
        name = pName;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract double calculatePay();
}
