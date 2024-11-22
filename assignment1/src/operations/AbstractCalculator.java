package operations;

public abstract class AbstractCalculator implements Calculations {
    @Override
    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public double average(int a, int b, int c) {
        return sum(a, b, c) / 3.0;
    }

    @Override
    public int product(int a, int b, int c) {
        return a * b * c;
    }

    @Override
    public int largest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    @Override
    public int smallest(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }
}
