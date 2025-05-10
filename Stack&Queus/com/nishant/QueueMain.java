package com.nishant;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomeQueue queue = new CustomeQueue(5);
        CircularQueue queue = new CircularQueue(5);
        // Fill up the queue
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);

        // Remove 2 elements (front moves forward)
        queue.remove(); // removes 1
        queue.remove(); // removes 2

        // Add 2 more elements (end wraps around to 0, 1)
        queue.insert(6);
        queue.insert(7);

        // Now try to display
        queue.display(); // ❌ Wrong output with original display method in normal queue






    }
}
