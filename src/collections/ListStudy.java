package collections;

import java.util.ArrayList;

public class ListStudy {

    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User("Ana");
        list.add(user1);

        list.add(new User("Carlos"));
        list.add(new User("John"));
        list.add(new User("Dutra"));

        System.out.println(list.get(3));
        list.remove(1);
        list.remove(new User("Dutra"));
        System.out.println(list.contains(user1));
        System.out.println(list.contains(new User("adqwef")));

        for (User user: list) {
            System.out.println(user.name);
        }
    }
}
