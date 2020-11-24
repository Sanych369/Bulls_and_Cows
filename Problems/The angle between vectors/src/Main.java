import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a1 = scanner.nextDouble();
        double a2 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double cosine = (a1 * b1 + a2 * b2)
                / (Math.hypot(a1, a2) * Math.hypot(b1, b2));
        System.out.println(Math.toDegrees(Math.acos(cosine)));
    }
}