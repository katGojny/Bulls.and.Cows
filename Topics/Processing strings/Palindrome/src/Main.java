import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int lenghtOfString = inputString.length();
        String firstString = " ";
        String secondString = " ";
        if (lenghtOfString % 2 != 0) {
            firstString = inputString.substring(0, lenghtOfString / 2 + 1);
            secondString = inputString.substring(lenghtOfString / 2, lenghtOfString);
        }
        else {
            firstString = inputString.substring(0, lenghtOfString / 2);
            secondString = inputString.substring(lenghtOfString / 2, lenghtOfString);
        }
        StringBuilder reverseSecondString = new StringBuilder(secondString);
        reverseSecondString.reverse();
        String secondStringAfterReverse = reverseSecondString.toString();
        boolean comparedStrings = firstString.equals(secondStringAfterReverse);
        if (comparedStrings == true){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        // put your code here
    }
}