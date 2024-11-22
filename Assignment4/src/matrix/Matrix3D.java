package matrix;

public class Matrix3D {
    private int dimensionX;
    private int dimensionY;
    private int dimensionZ;
    private int[] array1D;

    public Matrix3D(int dimensionX, int dimensionY, int dimensionZ) {
        this.dimensionX = dimensionX;
        this.dimensionY = dimensionY;
        this.dimensionZ = dimensionZ;
        this.array1D = new int[dimensionX * dimensionY * dimensionZ];
    }

    public void set(int value, int indexX, int indexY, int indexZ) {
        int index = (indexX * dimensionY * dimensionZ) + (indexY * dimensionZ) + indexZ;
        array1D[index] = value;
    }

    public int get(int indexX, int indexY, int indexZ) {
        int index = (indexX * dimensionY * dimensionZ) + (indexY * dimensionZ) + indexZ;
        return array1D[index];
    }

    public static void main(String[] args) {
        Matrix3D matrix = new Matrix3D(3, 3, 3);
        matrix.set(5, 1, 1, 1);
        int value = matrix.get(1, 1, 1);
        System.out.println("Value at (1,1,1): " + value);
    }
}
