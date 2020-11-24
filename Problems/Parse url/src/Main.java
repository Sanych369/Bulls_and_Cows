import java.util.Scanner;

class Main {
    private static final String SEPARATOR = " : ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] parameters = input.substring(input.indexOf("?") + 1).split("&");

        String password = "";
        for (String parameter : parameters) {
            String[] values = parameter.split("=");
            if (values[0].equals("pass")) {
                password = "password" + SEPARATOR + values[1];
            }
            System.out.println(values[0] + SEPARATOR + (values.length == 2 ? values[1] : "not found"));
        }
        if (!password.isEmpty()) {
            System.out.println(password);
        }

    }
}