import java.util.Scanner;

public class TelephoneDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single letter: ");
        char letter = scanner.next().charAt(0);

        if (Character.isUpperCase(letter) && "ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(String.valueOf(letter))) {
            int digit = -1;
            String[] letters = {"ABC", "DEF", "GHI", "JKL", "MNO", "PRS", "TUV", "WXY"};
            int[] digits = {2, 3, 4, 5, 6, 7, 8, 9};

            for (int i = 0; i < letters.length; i++) {
                if (letters[i].contains(String.valueOf(letter))) {
                    digit = digits[i];
                    break;
                }
            }

            if (digit != -1) {
                System.out.println("The digit " + digit + " corresponds to " + letter);
            } else {
                System.out.println("No matching digit for " + letter);
            }
        } else {
            System.out.println("Invalid input. Please enter a single uppercase letter.");
        }
    }
}
