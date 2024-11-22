package patternsearch;

import java.util.Scanner;

public class PatternSearch {

    public static int countPatternOccurrences(int a, int b, String pattern) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (String.valueOf(i).contains(pattern)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range start (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the range end (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter the pattern to search for: ");
        String pattern = scanner.next();

        int count = countPatternOccurrences(a, b, pattern);
        System.out.println("The number of times \"" + pattern + "\" occurred between " + a + " and " + b + ": " + count);

        scanner.close();
    }
}

