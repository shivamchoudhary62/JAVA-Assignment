package geometry1;

public class Cone extends Figure {
    private double r;
    private double s;
    private double h;

    public Cone(double r, double s, double h) {
        this.r = r;
        this.s = s;
        this.h = h;
        calcArea();
        calcVol();
    }

    @Override
    public void calcArea() {
        a = pi * r * s + pi * r * r;
    }

    @Override
    public void calcVol() {
        v = (pi * r * r * h) / 3;
    }

    @Override
    public void DispArea() {
        System.out.println("Cone Area: " + a);
    }

    @Override
    public void DispVol() {
        System.out.println("Cone Volume: " + v);
    }
}
