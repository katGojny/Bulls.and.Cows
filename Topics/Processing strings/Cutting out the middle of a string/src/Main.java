import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String imputString = scanner.next();
        int lenght = imputString.length();
        if (lenght % 2 != 0) {
            String substring1 = imputString.substring(0, lenght / 2);
            String substring2 = imputString.substring(lenght / 2 + 1, lenght);
            System.out.println(substring1 + substring2);
        }
        else {
            //String middle2Letters = imputString.substring(lenght / 2 - 1, lenght / 2 + 1);
            //String[] shortEvenArray = imputString.split(middle2Letters);
            //System.out.println(shortEvenArray[0] + shortEvenArray[1]);
            String substring1 = imputString.substring(0, lenght / 2 - 1);
            String substring2 = imputString.substring(lenght / 2 + 1, lenght);
            System.out.println(substring1 + substring2);
        }
    }
}
