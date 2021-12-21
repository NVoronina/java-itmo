package homework9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // первое задание (убрать дубли)
        ArrayList list = new ArrayList<String>();
        list.add("Test");
        list.add("TestJava");
        list.add("TestJava");
        list.add("testik");
        System.out.println(unique(list));

        // второе задание замерить ArrayList vs LinkedList
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = fillArrayList(1000000);
        getElement(10000, arrayList);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time arrayList: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        LinkedList<Integer> linkedList = fillLinkedList(1000000);
        getElement(10000, linkedList);
        endTime = System.currentTimeMillis();
        System.out.println("Total execution time linkedList: " + (endTime - startTime) + "ms");

        // третье задание User Map
        Map<User, Integer> mapUsers = new HashMap<User, Integer>();
        mapUsers.put(new User("John"), 3);
        mapUsers.put(new User("Pete"), 5);
        mapUsers.put(new User("Anna"), 4);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println(findSсore(name, mapUsers));
    }

    private static Integer findSсore(String name, Map<User, Integer> mapUsers) {
        for (Map.Entry<User, Integer> pair : mapUsers.entrySet()) {
            if (name.equalsIgnoreCase(pair.getKey().getName())) {
                return pair.getValue();
            }
        }
        return 0;
    }

    private static Set<String> unique(List<String> collection) {
        return new HashSet<>(collection);
    }

    private static ArrayList<Integer> fillArrayList(int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            list.add(i);
        }
        return list;
    }

    private static LinkedList<Integer> fillLinkedList(int max) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < max; i++) {
            list.add(i);
        }
        return list;
    }

    private static List<Integer> getElement(int max, List<Integer> list) {
        Random rand = new Random();
        for (int i = 0; i < max; i++) {
            list.get(rand.nextInt(1000000));
        }
        return list;
    }
}
