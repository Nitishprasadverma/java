package Threading.LEC1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method start");

        SharedResource sharedResource = new SharedResource();

        //Producer thread
        Thread producThread = new Thread(new ProduceTask(sharedResource));

        //Consumer thread

        Thread consumThread = new Thread(new ConsumeTask(sharedResource));

        //Thread is in Runnable state
        producThread.start();
        consumThread.start();

        System.out.println("Main method ends here..");

    }
}
