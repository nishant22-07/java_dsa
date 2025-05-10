package com.nishant;

public class CustomeQueue {
    protected int[] data;
    private static final int  DEFAULT_SIZE = 10;
    int end = 0;


    public CustomeQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomeQueue(int size) {
        this.data = new int[size];
    }

    boolean isFull() {
        return end ==data.length; // ptr is at last index
    }

    private boolean isEmpty(){
        return  end == 0;
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is full!");
            return false;
        }
        data[end++] = item;
        return true;

    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int removed = data[0];
        // we need to shift elements to left
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }
    public void display(){
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");

        }
    }



}







