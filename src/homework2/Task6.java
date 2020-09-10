package homework2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        if (s > 0) {
            System.out.print("Положительное ");
        } else if (s < 0) {
            System.out.print("Отрицательное ");
        } else {
            System.out.print("Нулевое число");
        }
        if (s % 2 == 0 & s != 0) {
            System.out.print("четное число ");
        } else if (s % 2 == 1 | s % 2 == -1) {
            System.out.print("нечетное число");
        }
    }
}
