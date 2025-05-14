package com.nishant;

public class CustomeCircularLL {
    private Node head;
    private Node tail;

    public CustomeCircularLL() {
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null ){
            head = node;
            tail = node;
            node.next = head;// make it Circular
            return;
        }else{
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }
    public void display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> " );
                node = node.next;
            }while (node != head );
            System.out.println("HEAD");
        }
        else{
            System.out.println("List is empty!");
        }
    }

    public void delete(int val) {
        if (head == null) return;

        // Delete head node
        if (head.value == val) {
            head = head.next;
            tail.next = head;
            return;
        }

        Node current = head;
        do {
            if (current.next.value == val) {
                current.next = current.next.next;
                // Update tail if needed
                if (tail.value == val) {
                    tail = current;
                }
                return;
            }
            current = current.next;
        } while (current != head);
    }


    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }
}
