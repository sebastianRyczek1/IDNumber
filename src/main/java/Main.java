import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IDChecker idChecker = new IDChecker(IdFormatChecker());
        idChecker.check();
    }
    private static String IdFormatChecker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swój nr dowodu");
        String message = sc.nextLine();
        while (!message.matches("[A-Z]{3}[0-9]{6}")) {
            System.out.println("Podaj poprawny format nr dowodu");
            message = sc.nextLine();
        }
        return message;
    }
}
