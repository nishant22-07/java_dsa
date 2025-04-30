package com.nishant;


import java.util.Stack;

public class InbuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(22);
        stack.push(7);
        stack.push(2004);
        stack.push(27);
        stack.push(7);
        stack.push(2004);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }


}
