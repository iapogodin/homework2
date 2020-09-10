package homework2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int sum = 0;
        while (s != 0) {
            sum = sum + (s % 10);
            s = s / 10;
        }
        System.out.println(sum);
    }

}
