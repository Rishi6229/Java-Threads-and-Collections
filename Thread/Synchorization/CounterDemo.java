package Thread.Synchorization;


import java.beans.Expression;

public class CounterDemo {
    public static void main(String[] args) {
        Counter c = new Counter();
        ThreadCounter t1 = new ThreadCounter(c);
        ThreadCounter t2 = new ThreadCounter(c);
        t1.run();
        t2.run();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){

        }
        System.out.println(c.getCount());
    }
}
