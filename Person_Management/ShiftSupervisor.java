public class ShiftSupervisor extends Employee {
private double annualSalary;
private double annualProductionBonus;

public ShiftSupervisor(String name, String employeeNumber, String hireDate, double annualSalary,
        double annualProductionBonus) {
    super(name, employeeNumber, hireDate);
    this.annualSalary = annualSalary;
    this.annualProductionBonus = annualProductionBonus;
}
public double getAnnualSalary() {
    return annualSalary;
}
public void setAnnualSalary(double annualSalary) {
    this.annualSalary = annualSalary;
}
public double getAnnualProductionBonus() {
    return annualProductionBonus;
}
public void setAnnualProductionBonus(double annualProductionBonus) {
    this.annualProductionBonus = annualProductionBonus;
}
public void shiftInfor() {
    System.out.println("Name:" + getName());
    System.out.println("Employee Number:" + getEmployeeNumber());
    System.out.println("Hire Date:" + getHireDate());
    System.out.println("Annual Salary: $" + getAnnualSalary());
    System.out.println("Annual Production Bonus: $" + getAnnualProductionBonus());
}


}
