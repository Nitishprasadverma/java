package Threading.LEC1;

public class SharedResource {
    boolean itemAvailable = false;

    public  synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by:" + Thread.currentThread().getName() + "and invoking all which are waiting");
        notifyAll();
    }

    public  synchronized void consumeItem(){
        System.out.println("ConsumeItem method invoked by: " + Thread.currentThread().getName());

        while (!itemAvailable) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName()+ "is waiting now") ;
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }

        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}
