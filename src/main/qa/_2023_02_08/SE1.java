package main.qa._2023_02_08;

import java.util.Stack;

public class SE1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("####");
        stack.push("!!!!");
        stack.push("%%%%");
        stack.push("&&&&");
        stack.push("^^^^");

        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack);
//
//        System.out.println(stack.peek());
        System.out.println(stack.remove(2));
        System.out.println(stack);
//        System.out.println(stack.peek());
    }
}