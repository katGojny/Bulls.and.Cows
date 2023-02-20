import java.lang.reflect.Array;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.next();
        String password = "";
        String[] keyAndValue = url.split("&");
        int i = 0;
        while (i < Array.getLength(keyAndValue)) {
            String[] key = keyAndValue[i].split("=");
            if (key[0].contains("pass")) {
                password = "password : " + key[1];
                System.out.println("pass : " + key[1]);
            }
            else if (key[0].contains("html?")) {
                System.out.println((key[0].split("\\?"))[1] + " : " + key[1]);
            }
            else if (Array.getLength(key) <= 1) {
                System.out.println(key[0] + " : not found");
            } 
            else {
                System.out.println(key[0] + " : " + key[1]);
            }
            i++;

        }
        System.out.println(password);// put your code here
    }
}
