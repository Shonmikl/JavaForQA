package main.qa._2023_02_01;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        /**
         * while() -
         * fori()
         * forEach()
         * if()
         */

        int[] ex = {78, 9, 6, 5, 4, 1, 2, 3, 6, 5, 4, 7, 89};
        for (int j : ex) {
            System.out.println(j*10);
        }
        System.out.println(Arrays.toString(ex));
    }
}
