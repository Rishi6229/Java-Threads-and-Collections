package Thread.Synchorization;

public class Counter {
    private int count = 0;

//    public Counter(int count){
//        this.count = count;
//    }

    public void incrementCounter(){
        count++;
    }

    public int getCount(){
        return count;
    }
}
