package generics;

import java.util.List;

public class ListUtil {

    public static Object getLastItem(List<?> list) {
        return list.get(list.size() - 1);
    }

    public static <T>T getLast(List<T> list) {
        return list.get(list.size() - 1);
    }
}
