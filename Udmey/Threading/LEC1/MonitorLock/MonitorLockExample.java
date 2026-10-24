package Threading.LEC1.MonitorLock;

public class MonitorLockExample {
    public synchronized void task1(){
        try {
            System.out.println("Inside task 1 ");
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public  void task2(){
       
            System.out.println("Task 2, but before synchronized");
         synchronized (this) {
            
            System.out.println("Task 2, inside synchronized");
        }
    }

    public  void  task3(){
        System.out.println("task-3");
    }
}
