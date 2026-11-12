package Threading.LEC3;

import java.util.concurrent.locks.StampedLock;

public class SharedResStamped {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();
    
    public  void producer(){
        long stamp = lock.readLock();
        try {
            System.out.println("Read lock acquired by :" + Thread.currentThread().getName());

            isAvailable = true;
            Thread.sleep(6000);
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            System.out.println("Read Lock release by: " + Thread.currentThread().getName());
            lock.unlock(stamp);
            
        }
    }

    public  void consume(){
        long stamp = lock.writeLock();
        try {
            System.out.println("Write Lock acquired by: " + Thread.currentThread().getName());

            isAvailable = true;
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
             System.out.println("Write Lock release by: " + Thread.currentThread().getName());
            lock.unlock(stamp);
           
        }
    }


}
