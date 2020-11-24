import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuilder answer = new StringBuilder();
        if (string.length() == 1) {
            answer = new StringBuilder(string + "1");
        } else {
            int counter = 0;
            char current = string.charAt(0);
            for (int i = 0; i < string.length(); i++) {
                if (current == string.charAt(i)) {
                    counter++;
                } else {
                    answer.append(current);
                    answer.append(counter);
                    current = string.charAt(i);
                    counter = 1;
                }
            }
            answer.append(current);
            answer.append(counter);
        }
        System.out.println(answer);
    }
}