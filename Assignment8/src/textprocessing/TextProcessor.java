package textprocessing;

import java.util.Scanner;

public class TextProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text: ");
        String input = scanner.nextLine();

        String target = "the";
        int firstIndex = input.indexOf(target);
        int lastIndex = input.lastIndexOf(target);

        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex) {
            System.out.println("The string 'the' was not found or only found once in the text.");
        } else {
            String enclosedText = input.substring(firstIndex + target.length(), lastIndex);
            System.out.println("Text enclosed between the first and last occurrence of 'the':");
            System.out.println(enclosedText);
        }

        scanner.close();
    }
}
