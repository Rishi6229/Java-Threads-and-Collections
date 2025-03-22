import java.util.*;
public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<Integer,Integer>nMap = new TreeMap<>();
        nMap.put(1 , 2);
        nMap.put(2 , 44);
        nMap.put(4 , 55);
        nMap.put(6 , 42);
        nMap.put(7 , 99);


        System.out.println(nMap);
        System.out.println(nMap.headMap(3));
        System.out.println(nMap.descendingMap());
        System.out.println(nMap.ceilingKey(6));
        System.out.println(nMap.floorKey(3));
    }
}
