package function;

import java.util.Arrays;

public class Client {

    public static int[] halveArray(int[] values) {
        int[] result = new int[values.length];
        Function halfFunction = new Half();

        for (int i = 0; i < values.length; i++) {
            result[i] = halfFunction.evaluate(values[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 50};
        int[] halvedValues = halveArray(values);

        System.out.println("Original array: " + Arrays.toString(values));
        System.out.println("Halved array: " + Arrays.toString(halvedValues));
    }
}
