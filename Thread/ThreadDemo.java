package Thread;

public class ThreadDemo {
    public static class Demo extends Thread{
        @Override
        public void run() {
            for(int i = 0; i < 100; i++){
                System.out.println("This is the main thread");
            }

            for(int j = 0; j < 100; j++){
                System.out.println("This  is a time pass !!");
            }
        }
    }

    public static class Demo2 extends Thread{
        @Override
        public void run(){
            for(int i = 0; i < 100; i++){
                System.out.println("another thread is running !!!!");
            }
        }
    }
    public static void main(String[] args) {
        Demo d = new Demo();
        Demo2 d2 = new Demo2();
        d2.start();
        d.start();


        d2.setPriority(Thread.MAX_PRIORITY);

//        d.yield();
        System.out.println(d.getPriority());

//        try{
//            d.join();
//        }catch (Exception _){
//
//        }

        System.out.println("ALL THE THREAD OPEARTIONS ARE DONE");


    }
}
