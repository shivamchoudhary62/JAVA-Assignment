package FigPackage;

public abstract class Figure {
    protected double r;
    protected double a;
    protected double v;
    protected double pi = 3.1428;

    public abstract void calcArea();
    public abstract void calcVolume();
    public abstract void dispArea();
    public abstract void dispVolume();
}
