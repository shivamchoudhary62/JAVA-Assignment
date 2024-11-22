package FigPackage;

public class Sphere extends Figure {

    public Sphere(double r) {
        this.r = r;
        calcArea();
        calcVolume();
    }

    @Override
    public void calcArea() {
        a = 4 * pi * r * r;
    }

    @Override
    public void calcVolume() {
        v = (4.0 / 3) * pi * r * r * r;
    }

    @Override
    public void dispArea() {
        System.out.println("Sphere Area: " + a);
    }

    @Override
    public void dispVolume() {
        System.out.println("Sphere Volume: " + v);
    }
}
