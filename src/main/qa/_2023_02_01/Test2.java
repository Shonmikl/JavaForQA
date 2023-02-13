package main.qa._2023_02_01;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        int[][] a = new int[3][7];
        int[][] b = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9},
                {11, 2, 5, 8, 9, 6, 54, 44, 52}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = new Random().nextInt(55);
            }
        }
    }
}