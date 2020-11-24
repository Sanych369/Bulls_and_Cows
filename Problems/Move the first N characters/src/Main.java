import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int value = sc.nextInt();

        stringUpdate(str, value);
    }

    public static void stringUpdate(String str, int value) {
        if (value > str.length()) {
            System.out.println(str);
        } else {
            String endIndex = str.substring(value);
            String beginIndex = str.substring(0, value);
            System.out.println(endIndex + beginIndex);
        }
    }
}