import java.util.Scanner;

class EmployeeManagement {

    public static String createEmail(String name, String surname) {
        StringBuilder name1 = new StringBuilder(name);
        StringBuilder surname1 = new StringBuilder(surname);
        StringBuilder email = name1.append(surname1 + "@work.net");
        String email1 = email.toString();
        // write your code here
        return email1;
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();

        String completeEmail = createEmail(name, surname);

        System.out.println(completeEmail);
    }
}