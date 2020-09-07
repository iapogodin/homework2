package homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int d = scanner.nextInt();
        int f = scanner.nextInt();
        int min = 0;
        if (s <= d & s <= f)
            min = s;
        if (d <= s & d <= f)
            min = d;
        if (f <= d & f <= s)
            min = f;

            System.out.println(min);
    }
}