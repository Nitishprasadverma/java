package Threading.LEC1;

public class Main1 {
    public static void main(String[] args) {
        
        System.out.println("Going inside main method: " + Thread.currentThread().getName());
       MultithreadingLearning runnableObj = new MultithreadingLearning();

        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }
}
