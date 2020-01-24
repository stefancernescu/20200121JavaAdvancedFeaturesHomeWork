package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        Key key = new Key("Madalin");
//        Key key1 = new Key("Karina");
//        System.out.println(key.getKey().equals(key1.getKey()));
//        System.out.println(key.equals(key1));

        //Liskov substitution principle
        //HashMap IS A Map
        Map<Integer, String> hashMap = new HashMap<>(5);
        hashMap.put(1, "Test1");
        hashMap.put(2, "Test2");
        hashMap.put(3, "Test3");
        hashMap.put(4, "Test4");
        hashMap.put(5, "Test5");
        hashMap.put(6, "Test6");
        hashMap.put(7, "Test7");
        hashMap.put(8, "Test8");

        for (Map.Entry<Integer, String> eachItem : hashMap.entrySet()) {
            System.out.println(eachItem.hashCode() + " " + eachItem.getValue());
        }


        if (hashMap.containsValue("Test6")) {
            System.out.println(hashMap.get("Test6"));
        }else{
            System.out.println("bleah");
        }

    }
}
