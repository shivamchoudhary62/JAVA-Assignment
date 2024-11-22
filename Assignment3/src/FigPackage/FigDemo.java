package FigPackage;

public class FigDemo {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 10);
        cone.dispArea();
        cone.dispVolume();

        Sphere sphere = new Sphere(7);
        sphere.dispArea();
        sphere.dispVolume();

        Cylinder cylinder = new Cylinder(4, 10);
        cylinder.dispArea();
        cylinder.dispVolume();
    }
}
