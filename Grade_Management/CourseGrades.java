public interface CourseGrades {
    // Phương thức để tính điểm trung bình
    public double getAverage() {
        

    // Phương thức để lấy điểm cao nhất
    public  double getHighest() {

    }

    // Phương thức để lấy điểm thấp nhất
    public double getLowest();

    void setEssay(Essay essay);

    void setFinalExam(FinalExam finalExam);

    void setLab(GradedActivity gradedActivity);

    void setPassFailExam(PassFailExam passFailExam);
}
