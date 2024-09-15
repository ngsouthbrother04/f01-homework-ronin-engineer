package _08_OOP.Bai4;

public class ConNguoi {
    private String fullName, dob, sex, phone, uniName, gradeLevel;

    public ConNguoi(String fullName, String dob, String sex, String phone, String uniName, String gradeLevel) {
        this.fullName = fullName;
        this.dob = dob;
        this.sex = sex;
        this.phone = phone;
        this.uniName = uniName;
        this.gradeLevel = gradeLevel;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return "fullName='" + fullName + '\'' + ", dob='" + dob + '\'' + ", sex='" + sex + '\'' + ", phone='" + phone + '\'' + ", uniName='" + uniName + '\'' + ", gradeLevel='" + gradeLevel + ' ';
    }
}