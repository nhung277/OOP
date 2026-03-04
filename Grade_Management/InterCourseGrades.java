import java.util.List;

public class InterCourseGrades implements CourseGrades {
    private GradedActivity[] grades;
        public InterCourseGrades() {
            grades = new GradedActivity[4];
        }
    
        public void setLab(GradedActivity gradedActivity) {
            grades[0] = gradedActivity;
        }
    
        public void setPassFailExam(PassFailExam passFailExam) {
            grades[1] = passFailExam;
        }
    
        public void setEssay(Essay essay) {
            grades[2] = essay;
        }
    
        public void setFinalExam(FinalExam finalExam) {
            grades[3] = finalExam;
        }
    
        public String toString() {
            return("GradedActivity:" + grades[0].getGrade() + grades[0].getScore() + "\nPassFailExam:"
                    + grades[1].getGrade() + grades[1].getScore() + "\nEssay:" + grades[2].getGrade() + grades[2].getScore()
                    + "\nFinalExam"
                    + grades[3].getGrade() + grades[3].getScore());
    
    }
    public InterCourseGrades(GradedActivity[]grades){
        this.grades=grades;
}

@Override
public double getAverage() {
    double sum = 0;
            for (GradedActivity grade : grades) {
            sum += grade.getScore();
            }
            return ( double) (sum /4);
        }
    
    
    @Override
public double getHighest() {
    
    GradedActivity highest = grades[0]; 
        for (int i = 1; i < grades.length; i++) {  
            if (grades[i].getScore() > highest.getScore()) {  
                highest = grades[i]; 
            }
        }
        return highest.getScore();}

@Override
public double getLowest() {
    GradedActivity lowest = grades[0]; 
        for (int i = 1; i < grades.length; i++) {  
            if (grades[i].getScore() < lowest.getScore()) {  
                lowest = grades[i]; 
            }
        }
        return lowest.getScore();}

    
}


