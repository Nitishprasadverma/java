package Threading.LEC1;

public class ProduceTask implements  Runnable{
    SharedResource sharedResource;
    public ProduceTask(SharedResource resource){
        this.sharedResource = resource;
    }
    @Override 
    public  void  run(){

        System.out.println("Producer thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(50001);
        } catch (Exception e) {
            // TODO: handle exception
        }
        sharedResource.addItem();
    }
}
