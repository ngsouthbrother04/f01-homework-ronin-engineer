package _07_Overview_OOP;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void C(double R) {
        double C = 2 * Math.PI * R;
        System.out.println("Chu vi: " + C);
    }

    public void S(double R) {
        double S = 2 * Math.PI * R * R;
        System.out.println("Dien tich: " + S);
    }
}
