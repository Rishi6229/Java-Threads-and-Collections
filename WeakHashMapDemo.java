import java.util.*;
public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Integer ,Integer>wMap = new WeakHashMap<>();
        wMap.put(1 , 1);
        wMap.put(2 , 3);
        wMap.put(3 , 9);
        wMap.put(4 , 6);
        System.out.println(wMap);
        wMap.put(wMap.get(1) , null);
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            System.out.println("the thread is still live  !!");
        }

        System.gc();

        System.out.println("The map after adding thread sleep " +wMap);
    }
}
