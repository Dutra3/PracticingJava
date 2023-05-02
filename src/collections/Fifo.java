package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fifo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Ana");
        queue.offer("Bia");
        queue.add("Carlos");
        queue.offer("Alberta");
        queue.add("BC");
        queue.offer("De");

        System.out.println(queue.peek());
        System.out.println(queue.element());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.remove()); // expect error message
    }
}
