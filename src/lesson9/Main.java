package lesson9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> strs = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            strs.add("Java");
        }
        strs.add("Javaaa");

        System.out.println(strs);
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 30);
        map.put("Doe", 40); // rewrite
        System.out.println(map);

        Set<String> str2 = map.keySet();
        Collection<Integer> coll = map.values();
        System.out.println(getKeyFromMap(map, 30));

        //lambda
        strs.forEach(s -> {
            if (s.length() > 4) {
                System.out.println(s);
            }
        });
    }

    public <T> void process(List<T> list) {
        for (T objects : list) {

        }
    }
    public static String getKeyFromMap(Map<String, Integer> map, Integer num) {
        String result = null;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer val = pair.getValue();
            if (val.equals(num)) {
                result = key;
            }
        }
        return result;
    }

    public static void method (Map<String, Integer> map, String name) {
        if (map.containsKey(name)) {
            Integer num = map.get(name);
        }
    }
}
