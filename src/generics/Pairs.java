package generics;

import java.util.*;

public class Pairs<K extends Number, V> {

    private final Set<Pair<K, V>> items = new LinkedHashSet<>();

    public void add(K key, V value) {
        if (key == null) return;

        Pair<K, V> newPair = new Pair<>(key, value);

        if (items.contains(newPair)) {
            items.remove(newPair);
        }

        items.add(newPair);
    }

    public V getValue(K key) {
        if (key == null) return null;

        Optional<Pair<K, V>> optionalPair = items.stream()
                .filter(pair -> key.equals(pair.getKey()))
                .findFirst();

        return optionalPair.map(Pair::getValue).orElse(null);
    }
}
