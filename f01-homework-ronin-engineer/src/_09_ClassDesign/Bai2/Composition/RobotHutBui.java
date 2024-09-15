package _09_ClassDesign.Bai2.Composition;

public class RobotHutBui {
    private CamBien c;
    private HopDungRac h;

    public RobotHutBui() {
        this.c = new CamBien();
        this.h = new HopDungRac();
    }
}
