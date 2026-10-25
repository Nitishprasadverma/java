package Threading.LEC1.Assingment1;

public class ConsumeTask implements Runnable {
    private final SharedResource sharedResource;

    public ConsumeTask(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {

        try {
            for (int i = 1; i <= 5; i++) {
                sharedResource.consume();
            }
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
            Thread.currentThread().interrupt();
        }
    }
}
