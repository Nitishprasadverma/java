package CollectionFrameWorks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMap {
    public static void main(String[] args) {
        System.out.println("----------below is LinkedHashMap output ----------");

        Map<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "A");
        map.put(21, "B");
        map.put(23, "C");
        map.put(141, "D");
        map.put(25, "E");

        map.forEach((Integer key, String val) -> System.out.println(key + " : " + val));

        System.out.println("----------below is normal hash map output ----------");

        Map<Integer, String> map2 = new HashMap<>();

        map2.put(1, "A");
        map2.put(21, "B");
        map2.put(23, "C");
        map2.put(141, "D");
        map2.put(25, "E");

        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }



        // with access Order true
          System.out.println("----------below is LinkedHashMap output ----------");

        Map<Integer, String> map1 =
                new LinkedHashMap<>(16, 0.75f, true);

        map1.put(1, "A");
        map1.put(21, "B");
        map1.put(23, "C");
        map1.put(141, "D");
        map1.put(25, "E");

        // accessing some data
        map1.get(23);

        map1.forEach((Integer key, String val) ->
                System.out.println(key + " : " + val));
    }
}
