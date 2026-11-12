package Threading.LEC3;

import java.util.concurrent.locks.StampedLock;

public class SharedOptimistic {
    int a = 10;
    StampedLock lock = new StampedLock();
    public  void producer(){
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("Taken optimistic lock");
            a = 11;
            Thread.sleep(6000);
            if(lock.validate(stamp)){
                System.out.println("updated a vale successfully");
            }else{
                System.out.println("rollback of work");
                a = 10;
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public  void consumer(){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by: " + Thread.currentThread().getName());

        try {
            System.out.println("Performing work");
            a = 9;
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            lock.unlock(stamp);
            System.out.println("Write lock released by: " + Thread.currentThread().getName());
        }
    }
}
