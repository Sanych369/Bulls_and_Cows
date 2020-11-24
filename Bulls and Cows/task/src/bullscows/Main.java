package bullscows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    String userInput;
    String secretCode;
    int bulls;
    int cows;

    static Scanner scanner = new Scanner(System.in);

    Main(String userInput, String secretCode) {
        this.userInput = userInput;
        this.secretCode = secretCode;
    }

    public static void main(String[] args) {
        System.out.println("Input the length of the secret code:");
        String userLength = scanner.next();

        try {
            Integer.parseInt(userLength);


            System.out.println("Input the number of possible symbols in the code:");

            int possibleSymbols = scanner.nextInt();
            boolean checkPossible = possibleSymbols <= 36;

            System.out.print("The secret is prepared: ");
            for (int i = 0; i < Integer.parseInt(userLength); i++) {
                System.out.print("*");
            }
            if (possibleSymbols < Integer.parseInt(userLength) || Integer.parseInt(userLength) == 0) {
                System.out.println("Error: it's not possible to generate a code with a length of " + userLength + " with " + possibleSymbols + " unique symbols.");
                return;
            }
            if (checkPossible) {
                if (possibleSymbols == 10) {
                    System.out.print(" (0-9)");
                } else if (possibleSymbols < 10) {
                    System.out.print(" (0-" + (possibleSymbols - 1) + ")");
                } else {
                    char a = 'a';
                    char end = (char) ('a' + (possibleSymbols - 11));
                    System.out.print(" (0-9, " + a + "-" + end + ")");
                }
                System.out.println();

                String secretCode = generateSecretCode(Integer.parseInt(userLength));
                Main code;
                int turn = 1;

                do {
                    System.out.println("Turn " + turn++);
                    String userInput = scanner.next();
                    code = new Main(userInput, secretCode);
                    code.checkCode();
                    code.printOutput();
                } while (code.bulls != code.secretCode.length());

                System.out.println("Congratulations! You guess the secret code.");
            } else {
                System.out.printf("Error: can't generate a secret number with a length of %s because there aren't enough unique digits.", userLength);
            }
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Error: \"" + userLength + "\" isn't a valid number.");
        }
    }

    static String generateSecretCode(int userLength) {
        // Generates the secret code
        StringBuilder secretCode = new StringBuilder();

        // Loops until the secret code is the length the user has requested
        while (secretCode.length() != userLength) {
            long pseudoRandomNumber = System.nanoTime();

            // Adds the pseudoRandomNumber into the number StringBuilder
            StringBuilder number = new StringBuilder();
            number.append(pseudoRandomNumber).reverse();
            // Removes any leading zeros
            if (number.charAt(0) == '0') {
                number.deleteCharAt(0);
            }

            // Adds the 1st character from number onto the secretCode
            secretCode.append(number.charAt(0));

            int i = 1;
            // Adds characters from the number onto the secretCode as long as the characters are different
            while (secretCode.length() != userLength && i < number.length()) {
                if (!secretCode.toString().contains(String.valueOf(number.charAt(i)))) {
                    secretCode.append(number.charAt(i));
                }
                i++;
            }
        }
        System.out.println("Okay, let's start a game!");
        return secretCode.toString();
    }

    void checkCode() {
        // Checks if the user's input is identical to the secret code
        if (userInput.equals(secretCode)) {
            this.bulls = secretCode.length();
        } else {
            for (int i = 0; i < secretCode.length(); i++) {
                // if the characters are the same
                if (this.userInput.charAt(i) == secretCode.charAt(i)) {
                    addBulls();
                    // if the secret code contains the character
                } else if (secretCode.contains(String.valueOf(userInput.charAt(i)))) {
                    addCows();
                }
            }
        }
    }

    void addBulls() {
        bulls++;
    }

    void addCows() {
        cows++;
    }

    void printOutput() {
        // Prints the bulls and cows
        if (bulls > 0 && cows > 0) {
            System.out.printf("Grade: %d bull(s) and %d cow(s)%n", bulls, cows);
        } else if (bulls > 0) {
            System.out.printf("Grade: %d bull(s)%n", bulls);
        } else if (cows > 0) {
            System.out.printf("Grade: %d cows(s)%n", cows);
        } else {
            System.out.println("Grade: None.");
        }
    }
}
