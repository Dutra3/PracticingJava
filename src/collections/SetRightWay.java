package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetRightWay {

    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        SortedSet<String> list2 = new TreeSet<>();

        list.add("Hello");
        list.add("World");
        list.add("ASDQWD");
        list.add("OK");

        list2.add("first");
        list2.add("second");
        list2.add("third");
        list2.add("fourth");

        for (String world: list) {
            System.out.println(world);
        }

        for (String position: list2) {
            System.out.println(position);
        }
    }

}

