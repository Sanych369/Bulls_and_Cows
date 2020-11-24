import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(Math.ceil(3,04));
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double sqrt = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
        double z = 2 * a;
        double x = (-b + sqrt) / z;
        double y = (-b - sqrt) / z;
        if (x < y) {
            System.out.println(x + " " + y);
        } else {
            System.out.println(y + " " + x);
        }
        // put your code here
    }
}