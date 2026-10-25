package Threading.LEC1.Assingment1;

public class ProduceTask implements Runnable {
    private final SharedResource sharedResource;

    public ProduceTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try {
            for (int item = 1; item <= 5; item++) {
                sharedResource.produce(item);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
        }
    }
}
