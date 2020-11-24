import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double road = scanner.nextDouble();
        int bus = scanner.nextInt();
        System.out.println(road / bus);
    }
}