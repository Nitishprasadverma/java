package Threading.LEC3;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedReadLock {
    boolean isAvailble = false;

    public void producer(ReadWriteLock lock){

        try {
            lock.readLock().lock();
            System.out.println("Read Lock acquired by: " + Thread.currentThread().getName());
            isAvailble = true;
            Thread.sleep(8000);
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            System.out.println("Read Lock release by: " + Thread.currentThread().getName());
            lock.readLock().unlock();
            
        }
    }

    public void consume(ReadWriteLock lock){

        try {
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by: " + Thread.currentThread().getName());
            isAvailble = false;
        } catch (Exception e) {
            // TODO: handle exception
        }finally{
            lock.writeLock().unlock();
            System.out.println("Write Lock release by: " + Thread.currentThread().getName());
        }
    }
}
