import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long t = 1;
        for (long i = t; i <= n; i++) {
            t *= i;

        }
        n = t;
        if (n == 0) {
            n = 1;
        }
        // write your code here
        return n;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
