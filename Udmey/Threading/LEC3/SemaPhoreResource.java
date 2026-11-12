package Threading.LEC3;

import java.util.concurrent.Semaphore;

public class SemaPhoreResource {
    boolean isAvailable = false;
    Semaphore lock  = new Semaphore(2);

    public  void producer (){

        try {
            lock.acquire();
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
             System.out.println("Lock release by: " + Thread.currentThread().getName());
            lock.release();
           
        }
    }
}
