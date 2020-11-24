import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        StringBuilder str2 = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            str2.append(str.charAt(i));
        }
        if (str.equals(str2.toString())) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }
    }
}