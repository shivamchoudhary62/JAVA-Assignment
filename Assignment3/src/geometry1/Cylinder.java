package geometry1;

public class Cylinder extends Figure {
    private double r;
    private double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
        calcArea();
        calcVol();
    }

    @Override
    public void calcArea() {
        a = 2 * pi * r * h + 2 * pi * r * r;
    }

    @Override
    public void calcVol() {
        v = pi * r * r * h;
    }

    @Override
    public void DispArea() {
        System.out.println("Cylinder Area: " + a);
    }

    @Override
    public void DispVol() {
        System.out.println("Cylinder Volume: " + v);
    }
}
