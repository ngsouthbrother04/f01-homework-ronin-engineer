package _09_ClassDesign.Bai02.Dependency;

public class Vehicle {
    void charge(Oil o) {
        System.out.println("Vehicle charging by " + o.toString());
    }
}
