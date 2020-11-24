import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            if ("0".equals(input)) {
                break;
            }
            try {
                System.out.println(Integer.parseInt(input) * 10);
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + input);
            }
        }
    }
}
