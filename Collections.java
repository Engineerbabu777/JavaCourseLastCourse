
import java.util.*;

class Collections{

    public static void main(String[] args) {
        // =======================================
        // 1️⃣ArrayList ( Ordered, Dynamic Array )
        // =======================================
        // ArrayList are dynamic arrays, they can grow and shrink in size.

        System.out.println("======= ArrayList =======");
        System.out.println("");

        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add(1, "orange"); // insert at index 1
        System.out.println(list); 
        list.remove(0); // remove by index
        System.out.println(list.get(0)); 
        System.out.println(list.size());
        System.out.println(list.contains("banana"));
        list.clear(); // remove all
        System.out.println(list);

        System.out.println("");
        System.out.println("================== ================== ==================");
        System.out.println("");




        // =======================================
        // 2️⃣LinkedList ( Nodes, Fast Insertion/Deletion )
        // =======================================

        System.out.println("======= LinkedList =======");
        System.out.println("");
        
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("apple");
        System.out.println(linkedList);
        linkedList.add("banana");
        System.out.println(linkedList);
        linkedList.addLast("cherry");
        System.out.println(linkedList);
        linkedList.addFirst("orange");
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);

        System.out.println("");
        System.out.println("================== ================== ==================");
        System.out.println("");
        


        // =======================================
        // 3️⃣HashSet ( Unordered, Unique Elements )
        // =======================================
        
        System.out.println("======= HashSet =======");
        System.out.println("");
        
        Set<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        System.out.println(hashSet);
        hashSet.add("banana");
        System.out.println(hashSet);
        hashSet.add("orange");
        System.out.println(hashSet);
        hashSet.add("apple");
        System.out.println(hashSet);
        hashSet.remove("banana");
        System.out.println(hashSet);
        hashSet.remove("orange");
        System.out.println(hashSet);
        hashSet.remove("apple");
        System.out.println(hashSet);
        System.out.println(hashSet.contains("apple"));

        System.out.println("");
        System.out.println("================== ================== ==================");
        System.out.println("");
        


        // =======================================
        // 4️⃣LinkedHashSet ( Ordered, Unique )
        // =======================================
        // LinkedHashSet<String> set = new LinkedHashSet<>();
        // set.add("apple");
        // set.add("banana");
        // set.add("orange");
        // System.out.println(set); // order preserved


        // =======================================
        // 5️⃣TreeSet ( Sorted Order )
        // =======================================
        // TreeSet<String> set = new TreeSet<>();
        // set.add("banana");
        // set.add("apple");
        // set.add("cherry");
        // System.out.println(set); // sorted automatically


        // =======================================
        // 6️⃣HashMap ( Key-Value Pairs )
        // =======================================

        System.out.println("======= HashMap =======");
        System.out.println("");

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        System.out.println(map);
        map.put("banana", 2);
        System.out.println(map);
        map.put("orange", 3);
        System.out.println(map);
        map.put("apple", 4);
        System.out.println(map);
        map.remove("banana");
        System.out.println(map);
        map.remove("orange");
        System.out.println(map);
        map.remove("apple");
        System.out.println(map);
        System.out.println(map.get("apple"));



        
        // =======================================
        // 7️⃣LinkedHashMap ( Insertion Order )
        // =======================================
        // LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        // map.put("one", 1);
        // map.put("two", 2);
        // map.put("three", 3);
        // System.out.println(map); // order preserved


        // =======================================
        // 8️⃣TreeMap ( Sorted by Key )
        // =======================================
        // TreeMap<String, Integer> map = new TreeMap<>();
        // map.put("two", 2);
        // map.put("one", 1);
        // map.put("three", 3);
        // System.out.println(map); // sorted alphabetically


    }
}