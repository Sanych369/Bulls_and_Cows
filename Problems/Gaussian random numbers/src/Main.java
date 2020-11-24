import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long k = scanner.nextLong();
        int n = scanner.nextInt();
        double m = scanner.nextDouble();
        Random rand = new Random();
        boolean allNumbersLessM = true;
        long seed = k - 1;
        do {
            seed++;
            allNumbersLessM = false;
            rand.setSeed(seed);
            for (int i = 0; i < n; i++) {
                if (rand.nextGaussian() >= m) {
                    allNumbersLessM = true;
                    break;
                }
            }
        } while (allNumbersLessM);
        System.out.println(seed);
    }
}