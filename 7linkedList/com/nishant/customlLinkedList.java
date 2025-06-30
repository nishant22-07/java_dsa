package com.nishant;


public class customlLinkedList {
    private Node head;
    private Node tail;
    private int size;




    public customlLinkedList() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val , int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp= temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
     }

     public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return val;
     }

     public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val = tail.value;
        Node secondLast = getNode(size-2);
        tail = secondLast;
        tail.next = null;
        size--;
         return val;
     }


     public int delete(int index){
        if(index == 0){
             return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node previousNode = getNode(index-1);
         Node toDelete = previousNode.next;
         previousNode.next = toDelete.next;
         size--;
         return toDelete.value;

     }
     public Node getNode(int index){
        Node node = head;
         for (int i = 0; i < index; i++) {
                node = node.next;
         }
         return node;
    }


    public Node findNode(int value){
        Node node = head;
        while(node!=null){
            if (node.value==value){
                return node;
            }
            node = node.next;
        }
        return null;
    }



    private static class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
