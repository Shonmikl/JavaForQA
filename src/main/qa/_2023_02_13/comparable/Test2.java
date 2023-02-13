package main.qa._2023_02_13.comparable;

import main.qa._2023_02_08.Person;
import main.qa._2023_02_13.comparator.SalaryComparator;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
//        List<Person> list = new LinkedList<>();

        Set<Person> set = new TreeSet<>(new SalaryComparator());

        Person p1 = new Person("Misha", 38, 2356);
        Person p2 = new Person("Pavel", 25, 1220);
        Person p3 = new Person("Elena", 19, 569);
        Person p4 = new Person("Kristina", 25, 9863);
        Person p5 = new Person("Kristina", 19, 999);
        Person p6 = new Person("Alex", 55, 8651);
        Person p66 = new Person("Alex", 55, 8651);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p66);

        System.out.println(set);
//
//        System.out.println(list);
//
//        Collections.sort(list, new SalaryComparator());
//
//        System.out.println(list);
    }
}
