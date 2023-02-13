package main.qa._2023_02_06;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ParallelStream {
    static Random random = new Random();
    static int n = 100_000_000;
    static List<Integer> list = new LinkedList<>();

    public static void main(String[] args) {
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(11));
        }

        long time = System.currentTimeMillis();

        double sum = list.parallelStream().reduce(Integer::sum).get();

        System.out.println(System.currentTimeMillis() - time);
        System.out.println(sum);
    }
}