package _08_OOP.Bai4;

public class NormailStudent extends ConNguoi {
    private int engScore;
    private double entryScore;

    public NormailStudent(String fullName, String dob, String sex, String phone, String uniName, String gradeLevel, int engScore, double entryScore) {
        super(fullName, dob, sex, phone, uniName, gradeLevel);
        this.engScore = engScore;
        this.entryScore = entryScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public double getEntryScore() {
        return entryScore;
    }

    public void setEntryScore(double entryScore) {
        this.entryScore = entryScore;
    }

    @Override
    public String toString() {
        return "NormailStudent{" + super.toString() + "engScore=" + engScore + ", entryScore=" + entryScore + '}';
    }
}