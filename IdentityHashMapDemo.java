import java.util.*;
public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key1");
        String key2 = new String("key1");

        String key3 = "key1";

        Map<String , Integer>mp = new HashMap<>();
        Map<String , Integer>Imp = new IdentityHashMap<>();

        mp.put(key1 , 1);
        mp.put(key2 , 2);
        mp.put(key3 , 3);

        Imp.put(key1 , 1);
        Imp.put(key2 , 2);
        Imp.put(key3 , 3);

        System.out.println("The normal hashmap is :" + mp);
        System.out.println("The identity hashmap is :"+ Imp);
    }
}
