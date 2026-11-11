package Threading.LEC3;

import java.util.concurrent.locks.ReentrantLock;

public class RentraintMain {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock() ;

        SharedResourceRentraint resource1 = new SharedResourceRentraint();

        Thread th1 = new Thread(() ->{
            resource1.producer(lock);
        });

        SharedResourceRentraint resource2 = new SharedResourceRentraint();

        Thread th2 = new Thread(() ->{

            resource2.producer(lock);
        });

        th1.start();
        th2.start();

    }
}
