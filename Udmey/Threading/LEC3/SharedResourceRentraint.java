package Threading.LEC3;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceRentraint {
    boolean isAvailble = false;

    public  void producer(ReentrantLock lock){

        try {
            lock.lock();

            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailble = true;
            Thread.sleep(4000);
        } catch (Exception e) {
            // TODO: handle exception

            Thread.currentThread().interrupt();
        }finally{
            
            System.out.println("Lock release by: " + Thread.currentThread().getName());
            lock.unlock();
            

            
        }
    }
}
