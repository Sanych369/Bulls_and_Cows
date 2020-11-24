import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double x = scanner.nextDouble();
        double x3 = x * x * x;
        double x2 = x * x;
        System.out.println(x3 + x2 + x + 1);
    }
}