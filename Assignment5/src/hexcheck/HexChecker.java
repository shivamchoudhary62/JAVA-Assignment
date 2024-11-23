package hexcheck;

public class HexChecker {
    public static boolean isHexadecimal(String number) throws InvalidHexException {
        for (char c : number.toCharArray()) {
            if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
                throw new InvalidHexException("Invalid Hexadecimal Number: " + number);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String number = "1A3F";
        try {
            if (isHexadecimal(number)) {
                System.out.println(number + " is a valid hexadecimal number.");
            }
        } catch (InvalidHexException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Ending the program.");
        }
    }
}
