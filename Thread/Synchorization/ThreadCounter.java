package Thread.Synchorization;

public class ThreadCounter extends Thread {
    private final Counter counter;
    public ThreadCounter(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        synchronized (this){
            for(int  i = 0 ; i < 1000; i++){
                counter.incrementCounter();
            }
        }

    }
}
