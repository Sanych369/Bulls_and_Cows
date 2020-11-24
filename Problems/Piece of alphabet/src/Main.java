import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.replace(" ", "");
        String[] strings = str.split("");

        int s = strings[0].charAt(0);
        boolean bool = true;

        for (int i = 1; i < strings.length; i++) {
            if (s + 1 == strings[i].charAt(0)) {
                s = strings[i].charAt(0);
            } else {
                bool = false;
                break;
            }
        }
        System.out.println(bool);
    }
}
