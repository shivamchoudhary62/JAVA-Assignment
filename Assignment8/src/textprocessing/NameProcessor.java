package textprocessing;

import java.util.Arrays;

public class NameProcessor {
    public static void main(String[] args) {
        String[] names = {"Alexander", "Benjamin", "Catherine", "Dominic", "Elizabeth", "Frederick", "Gabriella", "Harrison", "Isabella", "Jonathan"};

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() > 3) {
                names[i] = names[i].substring(3); // Delete the first three characters
            }
        }

        Arrays.sort(names); // Sort the names in alphabetical order

        System.out.println("Names after deleting first three characters and sorting:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
