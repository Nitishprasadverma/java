package CollectionFrameWorks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
         Map<Integer, String> rollNumberVsNameMap = new HashMap<>();

    rollNumberVsNameMap.put(null, "TEST");
    rollNumberVsNameMap.put(null, null);
    rollNumberVsNameMap.put(1, "A");
    rollNumberVsNameMap.put(2, "B");

    // compute if present
    rollNumberVsNameMap.putIfAbsent(null, "test");
    rollNumberVsNameMap.putIfAbsent(0, "ZERO");
    rollNumberVsNameMap.putIfAbsent(3, "C");

    for (Map.Entry<Integer, String> entryMap : rollNumberVsNameMap.entrySet()) {
        Integer key = entryMap.getKey();
        String value = entryMap.getValue();

        System.out.println("Key: " + key + " value: " + value);
    }

    // isEmpty
    System.out.println("isEmpty(): " + rollNumberVsNameMap.isEmpty());

    // size
    System.out.println("size: " + rollNumberVsNameMap.size());

    // containsKey
    System.out.println(
        "containsKey(3): " + rollNumberVsNameMap.containsKey(3)
    );

    // get(key)
    System.out.println(
        "get(1): " + rollNumberVsNameMap.get(1)
    );

    // getOrDefault(key)
    System.out.println(
        "get(9): " +
        rollNumberVsNameMap.getOrDefault(9, "default value")
    );

    // remove(key)
    System.out.println(
        "remove(null): " + rollNumberVsNameMap.remove(null)
    );

    for (Map.Entry<Integer, String> entryMap : rollNumberVsNameMap.entrySet()) {
        Integer key = entryMap.getKey();
        String value = entryMap.getValue();

        System.out.println("Key: " + key + " value: " + value);
    }

    // keySet()
    for (Integer key : rollNumberVsNameMap.keySet()) {
        System.out.println("Key: " + key);
    }

    // values()
    Collection<String> values = rollNumberVsNameMap.values();

    for (String value : values) {
        System.out.println("value: " + value);
    }
    }
}
