package com.nishant;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }
    public boolean isEmpty(){
        return size==0;
    }

    public boolean insert(int item) throws Exception{
        if(isFull()){
            throw new Exception("Circular Queue is full!");
        }
        data[end++]= item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty!");
        }
        int removed = data[front++];
        front = front% data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw  new Exception("Circular Queue is Empty!");
        }
        return data[front];
    }

    public void display(){
      if(isEmpty()){
          System.out.println("Empty!");
          return;
      }
      int i = front;
      do {
          System.out.print(data[i] + "->");
            i = (i+1) % data.length;
      }while (i!=end);
            System.out.println("END");

    }
}
