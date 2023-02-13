package main.qa._2023_02_06;

import java.util.ArrayList;
import java.util.List;

public class ALE {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(1000);
        stringList.add("Olga");
        stringList.add("Pavel");
        stringList.add("Viktoria");
        stringList.add("Kristina");
        stringList.add("Alexander");
        System.out.println(stringList);
        int result = stringList.size(); //5
        String name = stringList.get(2);
       // System.out.println(name);

        //System.out.println(stringList.contains("Mikhail"));
        System.out.println(stringList);

        stringList.set(0, "Mikhail");
        System.out.println(stringList);
    }
}