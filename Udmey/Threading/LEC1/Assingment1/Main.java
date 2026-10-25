package Threading.LEC1.Assingment1;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producer = new Thread(new ProduceTask(sharedResource), "Producer");

        Thread consumer = new Thread(
                new ConsumeTask(sharedResource),
                "Consumer");
        producer.start();
        consumer.start();
    }

}
