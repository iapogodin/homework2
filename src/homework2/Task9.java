package homework2;

import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
