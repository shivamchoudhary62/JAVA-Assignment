package geometry1;

public class Demo {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 10, 15);
        cone.DispArea();
        cone.DispVol();

        Sphere sphere = new Sphere(7);
        sphere.DispArea();
        sphere.DispVol();

        Cylinder cylinder = new Cylinder(4, 10);
        cylinder.DispArea();
        cylinder.DispVol();
    }
}
