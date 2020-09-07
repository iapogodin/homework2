package homework2;

import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int kol1 = 0;
        int kol2 = 0;
        double srd = 0;
        int[] arr = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
       // System.out.println(arr[arr.length - 1]);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > 0)
                sum1 = sum1 + arr[i];
            if (arr[i] < 0 & arr[i]%2 == 0)
                sum2 = sum2 + arr[i];
            if (arr[i] > 0)
                kol1 = kol1 + 1;
            if (arr[i] < 0) {
                kol2 = kol2 + 1;
                srd = srd + arr[i];
            }


        }
        System.out.println("Максимальное значение " + arr[arr.length - 1]);
        System.out.println("Сумма положительных элементов "  + sum1);
        System.out.println("Сумма четных отрицательных элементов "  + sum2);
        System.out.println("Среднее арифметическое отрицательных элементов "  + (srd/kol2));
    }
}
