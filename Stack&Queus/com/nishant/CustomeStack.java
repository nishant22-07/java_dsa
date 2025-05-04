package com.nishant;

public class CustomeStack {
    protected int[] data;
    private static final int  DEFAULT_SIZE = 10;
    int ptr = -1;


    public CustomeStack() {
        this(DEFAULT_SIZE);
    }

    public CustomeStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item ;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("cannot pop from empty stack!!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;

        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty Stack !!!!");
        }
        return data[ptr];
    }

    boolean isFull() {
        return ptr ==data.length-1; // ptr is at last index
    }

    private boolean isEmpty(){
        return  ptr == -1;
    }

}
