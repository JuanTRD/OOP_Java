package Queue_Array;

import Queue_Array.src.MyQueue;

public class App {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        System.out.println("------Add------");
        queue.enQueue(1);
        System.out.println(queue.getTail());
        queue.displayQueue();
        queue.enQueue(2);
        System.out.println(queue.getTail());
        queue.displayQueue();
        queue.enQueue(3);
        System.out.println(queue.getTail());
        queue.displayQueue();
        queue.enQueue(4);
        System.out.println(queue.getTail());
        queue.displayQueue();
        System.out.println();
        System.out.println("------Removed------");
        queue.deQueue();
        System.out.println(queue.getHead());
        queue.displayQueue();
        queue.deQueue();
        System.out.println(queue.getHead());
        queue.displayQueue();
        queue.deQueue();
        System.out.println(queue.getHead());
        queue.displayQueue();
        queue.deQueue();
        System.out.println(queue.getHead());
        queue.displayQueue();
    }
}
