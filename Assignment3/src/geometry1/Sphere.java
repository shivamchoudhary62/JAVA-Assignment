package geometry1;

public class Sphere extends Figure {
    private double r;

    public Sphere(double r) {
        this.r = r;
        calcArea();
        calcVol();
    }

    @Override
    public void calcArea() {
        a = 4 * pi * r * r;
    }

    @Override
    public void calcVol() {
        v = (4.0 / 3) * pi * r * r * r;
    }

    @Override
    public void DispArea() {
        System.out.println("Sphere Area: " + a);
    }

    @Override
    public void DispVol() {
        System.out.println("Sphere Volume: " + v);
    }
}
