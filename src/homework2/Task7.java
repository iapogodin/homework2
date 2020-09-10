package homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        double a = 0;
        double b = 10;
        switch (s) {
            case 905:
                a = 4.15;
                System.out.println("Москва. Стоимость разговора: " + a * b);
                break;
            case 194:
                a = 1.98;
                System.out.println("Ростов. Стоимость разговора: " + a * b);
                break;
            case 491:
                a = 2.69;
                System.out.println("Краснодар. Стоимость разговора: " + a * b);
                break;
            case 800:
                a = 5;
                System.out.println("Киров. Стоимость разговора: " + a * b);
                break;
        }
    }
}