import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberOfTicket = scanner.next();
        char[] numbersOfTicket = numberOfTicket.toCharArray();
        int Number1 = Character.getNumericValue(numbersOfTicket[0]);
        int Number2 = Character.getNumericValue(numbersOfTicket[1]);
        int Number3 = Character.getNumericValue(numbersOfTicket[2]);
        int Number4 = Character.getNumericValue(numbersOfTicket[3]);
        int Number5 = Character.getNumericValue(numbersOfTicket[4]);
        int Number6 = Character.getNumericValue(numbersOfTicket[5]);
        int sum1 = Number1 + Number2 + Number3;
        int sum2 = Number4 + Number5 + Number6;
        if (sum1 == sum2) {
        System.out.println("Lucky");
        }
        else {
            System.out.println("Regular");
        }// put your code here
    }
}
