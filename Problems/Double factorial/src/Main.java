import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        long s = n;
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.TWO;
        BigInteger res = BigInteger.ONE;
        if (n == 0 || n == 1) {
            return res;
        } else if (s % 2 == 1) {
            while (one.compareTo(BigInteger.valueOf(s)) <= 0) {
                res = res.multiply(one);
                one = one.add(BigInteger.TWO);
            }
        } else if (s % 2 == 0) {
            while (two.compareTo(BigInteger.valueOf(s)) <= 0) {
                res = res.multiply(two);
                two = two.add(BigInteger.TWO);
            }
        }
        return res;
        // type your java code here
    }

    public static void main(String[] args) {
        System.out.println((BigInteger.ONE.negate().subtract(new BigInteger("100"))).abs());
    }
}