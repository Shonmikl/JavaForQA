package main.qa._2023_02_08;

import java.util.LinkedList;
import java.util.Queue;

public class QE {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> emptyQueue = new LinkedList<>();

        queue.add("!!!!!");
        queue.add("@@@@@");
        queue.add("#####");
        queue.add("$$$$$");
        queue.add("%%%%%");

        queue.offer("PPPPP");

//        System.out.println(queue);
//
//        System.out.println(queue.remove());
//        System.out.println(queue);
//
//        System.out.println(queue.poll());
//        System.out.println(queue);

//        System.out.println(emptyQueue.poll());
//        System.out.println(queue.element());
//        System.out.println(queue.peek());
        System.out.println(queue);
        queue.remove(5);
        System.out.println(queue);


    }
}
