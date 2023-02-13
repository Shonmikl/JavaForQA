package main.qa;

import java.util.List;

public class Test {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }
    public static void main(String[] args) {
        System.out.println(sum(minus(88, sum(15, 25)), minus(111, sum(minus(85, 11), 5))));

    }
}
