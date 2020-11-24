import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticket = sc.next();
        int[] arr = new int[ticket.length()];
        for (int i = 0; i < ticket.length(); i++) {
            arr[i] = Character.getNumericValue(ticket.charAt(i));
        }
        if (arr[0] + arr[1] + arr[2] == arr[3] + arr[4] + arr[5]) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
            // put your code here
        }
    }
}