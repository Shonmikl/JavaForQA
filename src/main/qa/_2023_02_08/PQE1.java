package main.qa._2023_02_08;

import java.util.PriorityQueue;

public class PQE1 {
    public static void main(String[] args) {
//        Person p1 = new Person("Pavel", 31);
//        Person p2 = new Person("Kristina", 22);
//        Person p3 = new Person("Alexander", 35);
//        Person p4 = new Person("Olena", 21);
//        Person p5 = new Person("Mikhail", 18);

        PriorityQueue<Person> priorityQueue = new PriorityQueue<>();
//        priorityQueue.add(p1);
//        priorityQueue.add(p2);
//        priorityQueue.add(p3);
//        priorityQueue.add(p4);
//        priorityQueue.add(p5);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}