package password;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password.length() < 5 || password.length() > 12) {
            return false;
        }

        boolean hasLower = false;
        boolean hasDigit = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c) || !Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true;
            }
        }

        if (!hasLower || !hasDigit) {
            return false;
        }

        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String[] testPasswords = {
            "abcanan1",
            "abc11se",
            "123sd123",
            "adfasdsdf",
            "Aasdfasd12"
        };

        for (String password : testPasswords) {
            System.out.println("Password: " + password + " is " + (isValidPassword(password) ? "valid" : "invalid"));
        }
    }
}
