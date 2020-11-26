import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here+
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();

        BigInteger x = BigInteger.ONE;
        BigInteger z = BigInteger.ONE;

        while (a.compareTo(z) > 0) {
            z = z.multiply(x);
            x = x.add(BigInteger.ONE);
        }
        System.out.println(x.subtract(BigInteger.ONE));
    }
}