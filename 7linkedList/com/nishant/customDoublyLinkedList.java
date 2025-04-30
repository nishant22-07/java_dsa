package com.nishant;


public class customDoublyLinkedList {
    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next =head;
        node.prev =null;
        if (head != null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        while (node != null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.print("END");
    }
    public void displayRev(){
        Node node = head ;
        while (node != null){
            System.out.print(node.value+" -> ");
            node = node.next;
        }
        System.out.print("END");
    }




    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
