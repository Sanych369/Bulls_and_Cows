import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = BigInteger.ZERO.subtract(sc.nextBigInteger());
        BigInteger b = sc.nextBigInteger();
        BigInteger c = sc.nextBigInteger();
        BigInteger d = sc.nextBigInteger();
        System.out.println(a.multiply(b).add(c).subtract(d));
        // put your code here
    }
}