package calculations;

public class SquareAndCubes {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        for (int i = 0; i <= 10; i++) {
            int square = i * i;
            int cube = i * i * i;

            System.out.printf("%d\t%d\t%d\n", i, square, cube);
        }
    }
}
