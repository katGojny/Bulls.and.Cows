class SimpleCalculator {

    // Implement your methods here
    public static void subtractTwoNumbers(long a, long b) {
        long result1 = a - b;
        System.out.println(result1);
    }


    public static void sumTwoNumbers(long c, long d) {
        long result2 = c + d;
        System.out.println(result2);
    }


    public static void divideTwoNumbers(long e, long f) {
        if (f == 0) {
            System.out.println("Division by 0!");
        }
        else {
            long result3 = e / f;
            System.out.println(result3);
        }
    }


    public static void multiplyTwoNumbers(long g, long h) {
        long result4 = g * h;
        System.out.println(result4);
    }

    // Implemented method
    public static void power(long n, long p) {
        long number = n;
        long power = p;
        long result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result *= number;
            }
            power /= 2;
            number *= number;
        }
        System.out.println(result);
    }
}

public class Main {

    public static void main(String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        long num1 = scanner.nextLong();
        String operator = scanner.next();
        long num2 = scanner.nextLong();

        switch (operator) {
            case "^":
                SimpleCalculator.power(num1, num2);
                break;
            case "+":
                SimpleCalculator.sumTwoNumbers(num1, num2);
                break;
            case "-":
                SimpleCalculator.subtractTwoNumbers(num1, num2);
                break;
            case "/":
                SimpleCalculator.divideTwoNumbers(num1, num2);
                break;
            case "*":
                SimpleCalculator.multiplyTwoNumbers(num1, num2);
                break;
            default:
                break;
        }
    }
}