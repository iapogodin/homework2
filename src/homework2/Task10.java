package homework2;

import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        int[] arr = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        for (int i = 0, j = arr.length - 1; i < arr.length; i++)
        {
            if (arr[i] == 0 & i <= j)
            {
                if (arr[j] == 0) j = j - 1;
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
            j = j - 1;
        }

    }
        System.out.println(Arrays.toString(arr));
}
}
