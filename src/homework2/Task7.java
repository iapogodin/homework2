package homework2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        double a = 0;
        switch (s) {
            case 905:
                //a = 4.15;
                System.out.println("Москва. Стоимость разговора: 41.5");
                break;
            case 194:
                //a = 1.98;
                System.out.println("Ростов. Стоимость разговора: 19.8");
                break;
            case 491:
                //a = 2.69;
                System.out.println("Краснодар. Стоимость разговора: 26.9");
                break;
            case 800:
                //a = 5;
                System.out.println("Киров. Стоимость разговора: 50.0");
                break;
        }
    }
}