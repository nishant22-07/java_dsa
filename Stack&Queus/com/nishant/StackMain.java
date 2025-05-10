package com.nishant;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomeStack stack = new CustomeStack(6);
        DynamicStack stack = new DynamicStack(6);
        stack.push(22);
        stack.push(7);
        stack.push(2004);
        stack.push(27);
        stack.push(7);
        stack.push(2004);
        stack.push(2004);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();

    }
}
