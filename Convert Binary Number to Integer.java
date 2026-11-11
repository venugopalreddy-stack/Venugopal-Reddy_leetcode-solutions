import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        String s = sc.next();

        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            num = num * 2 + digit;
        }

        System.out.println("Integer: " + num);
    }
}
