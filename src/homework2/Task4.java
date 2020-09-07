package homework2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s > 0)
            s = s + 1;
        else if (s < 0)
            s = s - 2;
        else
            s = 10;
        System.out.println(s);
    }
}

