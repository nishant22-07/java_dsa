package com.nishant;


public class customlLinkedList {
    private node head;
    private node tail;
    private int size;

    private class node {
        private int value;
        private node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }
    }

}
