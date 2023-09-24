import java.util.Objects;

public class Main {

    private static boolean containsAllTypes(String input) {
        boolean hasDigit = false;
        boolean hasLetter = false;
        boolean hasSpecialChar = false;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLetter(c)) {
                hasLetter = true;
            } else {
                hasSpecialChar = true;
            }

            if (hasDigit && hasLetter && hasSpecialChar) {
                return true;
            }
        }

        return false;
    }

    public static String changePassword(String newPassword, String currentPassword) {
        if (newPassword.isEmpty()) {
            return "empty_password";
        }
        else {
            if (newPassword.length() < 6 || newPassword.length() > 20) {
                return "length_error";
            }
            else {
                if (Objects.equals(currentPassword, newPassword)) {
                    return "duplicated_password_error";
                } else {
                    if (containsAllTypes(newPassword)) {
                        return "good_password";
                    } else {
                        return "password_error";
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

    }
}
