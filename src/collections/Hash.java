package collections;

import java.util.HashSet;

public class Hash {

    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();

        users.add(new User("Ana"));
        users.add(new User("Pedro"));

        boolean result = users.contains(new User("Pedro"));
        System.out.println(result);

        // if I remove hashcode in User, this will return false!!
    }
}
