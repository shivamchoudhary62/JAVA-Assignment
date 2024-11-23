package textprocessing;

import java.util.Scanner;

public class TitleCaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }

        System.out.println("Resulting string: " + result.toString().trim());

        scanner.close();
    }
}
