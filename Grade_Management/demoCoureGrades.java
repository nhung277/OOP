public class demoq5 {
    public static void main(String[] args) {
        GradedActivity gradedActivity = new GradedActivity();
        gradedActivity.setScore(70);
        PassFailExam passFailExam = new PassFailExam(10, 3, 70);
        Essay essay = new Essay(20, 25, 20, 20, 80);
        FinalExam finalExam = new FinalExam(50, 15);

        CourseGrades courseGrades = (CourseGrades) new InterCourseGrades();

        courseGrades.setEssay(essay);
        courseGrades.setFinalExam(finalExam);
        courseGrades.setLab(gradedActivity);
        courseGrades.setPassFailExam(passFailExam);
    
        System.out.println(courseGrades);
    }
}
