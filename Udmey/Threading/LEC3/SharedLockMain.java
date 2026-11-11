package Threading.LEC3;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedLockMain {

    public static void main(String[] args) {
        SharedReadLock resource = new SharedReadLock();

    ReadWriteLock lock = new ReentrantReadWriteLock();

    Thread th1 = new Thread(() ->{
        resource.producer(lock);
    });

    Thread th2 = new Thread(() ->{
        resource.producer(lock);
    });

   SharedReadLock  resource1 = new SharedReadLock();

   Thread  th3 = new Thread(() ->{
    resource1.consume(lock);
   });
   th1.start();
   th2.start();
   th3.start();

    }
    
}
