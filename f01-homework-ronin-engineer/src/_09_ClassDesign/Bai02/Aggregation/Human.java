package _09_ClassDesign.Bai02.Aggregation;

public class Human {
    private Hat h;
    private Clothes c;

    public Human() {}

    public Human(Hat h) {
        this.h = h;
    }

    public Human(Clothes c) {
        this.c = c;
    }

    public Human(Hat h, Clothes c) {
        this.h = h;
        this.c = c;
    }
}
