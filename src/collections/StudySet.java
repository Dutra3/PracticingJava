package collections;

import java.util.HashSet;
import java.util.Set;

public class StudySet {

    public static void main(String[] args) {
        HashSet collections = new HashSet();

        collections.add(1.2);
        collections.add(true);
        collections.add("Teste");
        collections.add(1);
        collections.add('x');
        collections.remove("Teste");
        System.out.println(collections.remove("Teadwd"));
        System.out.println(collections);
        System.out.println(collections.contains("Teste"));
        System.out.println(collections.contains(true));
        System.out.println(collections.size());

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        collections.addAll(nums);
        System.out.println(collections);
        System.out.println(collections.retainAll(nums));
    }
}
