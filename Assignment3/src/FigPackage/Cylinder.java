package FigPackage;

public class Cylinder extends Figure {
    private double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
        calcArea();
        calcVolume();
    }

    @Override
    public void calcArea() {
        a = 2 * pi * r * h + 2 * pi * r * r;
    }

    @Override
    public void calcVolume() {
        v = pi * r * r * h;
    }

    @Override
    public void dispArea() {
        System.out.println("Cylinder Area: " + a);
    }

    @Override
    public void dispVolume() {
        System.out.println("Cylinder Volume: " + v);
    }
}
