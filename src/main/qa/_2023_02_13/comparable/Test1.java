package main.qa._2023_02_13.comparable;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Misha");
        list.add("Kristina");
        list.add("Pavel");
        list.add("Elena");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);


    }
}
