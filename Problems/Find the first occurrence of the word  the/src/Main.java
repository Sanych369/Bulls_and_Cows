import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = str.toLowerCase();
        if (str2.contains("the")) {
            System.out.println(str2.indexOf("the"));
        } else {
            System.out.println(-1);
        }
    }
}