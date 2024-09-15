package _08_OOP.Bai4;

public class GoodStudent extends ConNguoi {
        private double gpa;
        private String bestRewardName;

    public GoodStudent(String fullName, String dob, String sex, String phone, String uniName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, dob, sex, phone, uniName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return "GoodStudent{" + super.toString() + "gpa=" + gpa + ", bestRewardName='" + bestRewardName + '\'' + '}';
    }
}