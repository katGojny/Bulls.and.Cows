import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        for (int i = 0; i < inputString.length(); i++) {
            System.out.print(inputString.charAt(i) + "" + inputString.charAt(i));
        }// put your code here
    }
}
