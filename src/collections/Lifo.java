package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lifo {

    public static void main(String[] args) {
        Deque<String> books = new ArrayDeque<>();

        books.add("O pequeno principe");
        books.push("Dom Quixote");
        books.push("O Hobbit");

        System.out.println(books.peek());
        System.out.println(books.element());

        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.poll());
        System.out.println(books.pop());
    }
}
