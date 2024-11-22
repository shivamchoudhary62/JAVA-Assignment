package FigPackage;

public class Cone extends Figure {
    private double s;

    public Cone(double r, double s) {
        this.r = r;
        this.s = s;
        calcArea();
        calcVolume();
    }

    @Override
    public void calcArea() {
        a = (pi * r * s) + (pi * r * r);
    }

    @Override
    public void calcVolume() {
        v = (pi * r * r * s) / 3;
    }

    @Override
    public void dispArea() {
        System.out.println("Cone Area: " + a);
    }

    @Override
    public void dispVolume() {
        System.out.println("Cone Volume: " + v);
    }
}
