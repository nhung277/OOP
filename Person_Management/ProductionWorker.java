
public class ProductionWorker extends Employee {
private int Shift;
private double hourlyPayRate;

public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
    super(name, employeeNumber, hireDate);
    this.Shift = shift;
    this.hourlyPayRate = hourlyPayRate;
}
public int getShift() {
    return Shift;
}
public void setShift(int shift) {
    this.Shift=shift;
}
    
public double getHourlyPayRate() {
    return hourlyPayRate;
}
public void setHourlyPayRate(double hourlyPayRate) {
    this.hourlyPayRate = hourlyPayRate;
}
public void productionInfor() {
    String shiftName= (Shift==1) ? "Day Shift" : "Night Shift";
    System.out.println("Name:" + getName());
    System.out.println("Employee Number:" + getEmployeeNumber());
    System.out.println("Hire Date:" + getHireDate());
    System.out.println("Shift:" + shiftName);
    System.out.println("Hourly Pay Rate: $" + getHourlyPayRate());
}
}
