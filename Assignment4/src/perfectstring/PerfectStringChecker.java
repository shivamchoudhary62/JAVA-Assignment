package perfectstring;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PerfectStringChecker {

    public static boolean isPerfectString(String input) {
        Set<Character> charSet = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (charSet.contains(c)) {
                return false;
            }
            charSet.add(c);
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        if (isPerfectString(input)) {
            System.out.println("The string is a perfect string.");
        } else {
            System.out.println("The string is not a perfect string.");
        }

        scanner.close();
    }
}

