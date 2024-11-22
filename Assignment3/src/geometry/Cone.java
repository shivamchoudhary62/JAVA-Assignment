package geometry;

public class Cone extends Figure {
    private double h;
    private double s;

    public Cone(double r, double h, double s) {
        this.r = r;
        this.h = h;
        this.s = s;
        calcArea();
        calcVolume();
    }

    public void calcArea() {
        a = Math.PI * r * s + Math.PI * r * r;
    }

    public void calcVolume() {
        v = (Math.PI * r * s) / 3;
    }
}
