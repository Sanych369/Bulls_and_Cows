import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split(" ");
        String result = "";
        for (String string : strings) {
            if (string.length() > result.length()) {
                result = string;
            }
        }
        System.out.println(result);
    }
}