public class TeamLeader extends ProductionWorker {
    private double monthlyBonus;
    private int trainingHours;
    private int TrainingHoursLeader;

    public TeamLeader(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate,
            double monthlyBonus, int trainingHours, int trainingHoursLeader) {
        super(name, employeeNumber, hireDate, shift, hourlyPayRate);
        this.monthlyBonus = monthlyBonus;
        this.trainingHours = trainingHours;
        TrainingHoursLeader = trainingHoursLeader;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public int getTrainingHours() {
        return trainingHours;
    }

    public void setTrainingHours(int trainingHours) {
        this.trainingHours = trainingHours;
    }

    public int getTrainingHoursLeader() {
        return TrainingHoursLeader;
    }

    public void setTrainingHoursLeader(int trainingHoursLeader) {
        TrainingHoursLeader = trainingHoursLeader;
    }

    public void leaderTeamInfor () {
       productionInfor();
       System.out.println("Monthly Bonus: $"+getMonthlyBonus());
       System.out.println("The Number of training hours:"+getTrainingHours());
       System.out.println("the number of training hours that the team leader has attended:"+getTrainingHoursLeader());
    }

    
}
