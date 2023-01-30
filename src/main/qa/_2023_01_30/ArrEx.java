package main.qa._2023_01_30;

import java.util.Arrays;

public class ArrEx {
    public static void main(String[] args) {
        int[] arr = new int[22];
        int[] arr1 = {7, 89, 6, 54, 1, 2, 3};

        int s = 5;
        System.out.println(s);
        System.out.println(arr1[5]);
        System.out.println(Arrays.toString(arr1));

        /**
         * 1.Arr[22]
         * 2.loop ->
         *  - sum 0-last
         *  - last-0
         *  - чет индекс and нечет индекс
         *  - 0 -> <- last
         */
    }
}