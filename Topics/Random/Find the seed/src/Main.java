import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int resultSeed = 0;
        int resultNumber = 0;
        int seed = 0;
        int max = k;
        int minNumber = k;
        int resultSeed0 = 0;
        for (int j = a; j <= b; j++) {

            int number = 0;
            int oldNumber = 0;
            if (max < minNumber) {
                minNumber = max;
                resultSeed0 = seed;
            }
            seed = j;
            Random random = new Random(seed);
            for (int i = 1; i <= n; i++) {
                if (oldNumber < number) {
                    oldNumber = number;
                }
                number = random.nextInt(k);
                oldNumber = Math.max(number, oldNumber);
                max = oldNumber;

            }

            resultSeed = resultSeed0;
            resultNumber = minNumber;
            // write your code here
        }
        System.out.println(resultSeed);
        System.out.println(resultNumber);

    }
}