import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.next();
        sequence = sequence.toLowerCase();
        int l = sequence.length();
        int cg = 0;
        for (int i = 0; i < l; i++){
            if (sequence.charAt(i) == 'c'|| sequence.charAt(i) == 'g') {
                cg += 1;
            }
      /*      if (sequence.charAt(i) == 'g') {
                cg += 1;
            } */
        }
        double result = (double) cg / l * 100;
        System.out.println(result);
        // put your code here
    }
}