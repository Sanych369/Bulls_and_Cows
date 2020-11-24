import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split("-");
        String result = "";
        result += strings[1] + "/" + strings[2] + "/" + strings[0];
        System.out.println(result);
        char[] chars = { 'H', 'Y', 'P', 'E', 'R', '-', 'S', 'K', 'I', 'L', 'L' };

        String stringFromChars = String.valueOf(chars);

        String[] string = stringFromChars.split("-");
        System.out.println(Arrays.toString(string));
    }
}