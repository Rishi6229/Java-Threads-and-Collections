package Thread.Locks;

import java.beans.Expression;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;

    private Lock lock = new ReentrantLock();
    public  void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+ amount);
        try{
            if(lock.tryLock(1000 , TimeUnit.MICROSECONDS)){
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() +" Processing request");
                        Thread.sleep(4000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName()+" completed request remaining balance "+ balance);
                    }
                    catch(Exception e){
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName()+" completed withdrawl , Remaining balance " + balance);
                }
            }
            else{
                System.out.println(Thread.currentThread().getName()+" could not acquire the lock , will try later");
            }
        }catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}

