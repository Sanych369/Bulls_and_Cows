import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int upper = scanner.nextInt();
        int lower = scanner.nextInt();
        int number = scanner.nextInt();
        int length = scanner.nextInt();

        for (int i = 0; i < upper; i++) {
            System.out.print(i % 2 == 0 ? "A" : "B");
        }
        for (int i = 0; i < lower; i++) {
            System.out.print(i % 2 == 0 ? "a" : "b");
        }
        for (int i = 0; i < number; i++) {
            System.out.print(i % 2 == 0 ? "1" : "2");
        }
        for (int i = 0; i < length - upper - lower - number; i++) {
            System.out.print(i % 2 == 0 ? "X" : "Y");
        }
    }
}