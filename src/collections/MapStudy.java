package collections;

import java.util.HashMap;
import java.util.Map;

public class MapStudy {

    public static void main(String[] args) {
        Map<Integer, String> users = new HashMap<>();

        users.put(1, "Robert");
        users.put(2, "Test");

        System.out.println(users.size());
        System.out.println(users.isEmpty());
        System.out.println(users.keySet());
        System.out.println(users.values());
        System.out.println(users.entrySet());
        System.out.println(users.containsKey(20));
        System.out.println(users.containsValue("Test"));
        System.out.println(users.get(1));

        for (int key: users.keySet()) {
            System.out.println(key);
        }

        for (String value: users.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> register: users.entrySet()) {
            System.out.println(register.getKey());
            System.out.println(register.getValue());
        }
    }
}
