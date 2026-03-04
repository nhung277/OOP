package lab3;
public class ParkedCar {
    
    private String make;
    private String model;
    private String color;
    private String licenseNumber;
    private int NumberOfMinutes;
    
    public ParkedCar(String make, String model, String color, String licenseNumber, int numberOfMinutes) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licenseNumber = licenseNumber;
        NumberOfMinutes = numberOfMinutes;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getNumberOfMinutes() {
        return NumberOfMinutes;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        NumberOfMinutes = numberOfMinutes;
    }


}
