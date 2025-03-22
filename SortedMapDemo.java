import java.util.*;
class Pair implements Comparable<Pair>{
    int marks;
    String name;
    public Pair(int marks , String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.compare(this.marks , o.marks);
    }
}
public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String>mp = new TreeMap<>((a , b)-> b - a);
        mp.put(87 , "Rishi");
        mp.put(34 , "Mayank");
        mp.put(33 , "Navneet");
        mp.put(23 , "Animesh");
        System.out.println(mp);


        SortedMap<Pair , Integer> pairMap = new TreeMap<>();

        pairMap.put(new Pair(34 , "Ayush") , 1);
        pairMap.put(new Pair(56 , "Amit" ) , 2);
        pairMap.put(new Pair(99 , "Jarubi") , 3);
        pairMap.put(new Pair(66 , "Rishi") , 4);

        for(Map.Entry<Pair , Integer>itr: pairMap.entrySet()){
             Pair p = itr.getKey();
             String name = p.name;
             int marks = p.marks;
            System.out.println(name +" : " + marks);
        }


    }
}
