package main.qa._2023_02_13.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SETEX1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(new Random().nextInt(22));
        }

       // System.out.println(set);

        //System.out.println(set.contains(4));

        /**
         * [1 2 6 9 11 55 4 3 20 20]
         */
        int[] arr = {1, 2, 6, 9, 14, 2, 99, 55, 4, 3, 20};

        Set<Integer> set1 = new HashSet<>();
        for (int j : arr) {
            set1.add(j);
        }

        System.out.println(arr.length == set1.size() ? "Нет повторений" : "Есть повторения");

        System.out.println(set1);
        //5 = 4 ?
    }
}
