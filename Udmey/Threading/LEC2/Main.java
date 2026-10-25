package Threading.LEC2;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        System.out.println("Main thread started:");

        Thread th1 = new Thread(() ->{
            
            System.out.println("Thread1 calling produce method:");
            sharedResource.produce();
        });

        // Thread th2 = new Thread(() ->{
        //     try {
        //         Thread.sleep(1000);
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }

        //     System.out.println("Thread2 calling produce method:");
        //     sharedResource.produce();
        // });
        
        // th2.start();

        // try {
        //     Thread.sleep(3000);
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        // System.out.println("Thread1 is suspended");

     
        // th1.start();
        // try {
        //     System.out.println("Main thread is waiting thread1 to finish now:");
        //     th1.join();
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }

        //+++++++++++Deamon Thread+++++++++++++++++++++++++++++
       // th1.setDaemon(true);

       th1.setDaemon(true);
       th1.start();
        System.out.println("Main finishes it works");
    }
}
