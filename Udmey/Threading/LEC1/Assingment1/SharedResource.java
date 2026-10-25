package Threading.LEC1.Assingment1;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private final Queue<Integer> buffer = new LinkedList<>();

    private final int capacity = 3;

    public synchronized void produce(int item) throws InterruptedException {

        while (buffer.size() == capacity) {
            System.out.println("Buffer Full. Producer is waiting...");
            wait();

        }
        buffer.add(item);
        System.out.println("Produceed: " + item);
        notifyAll();
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer.isEmpty()) {
            System.out.println("Buffer empty. Consumer waiting...");
            wait();
        }

        int item = buffer.poll();
        System.out.println("Consumed: " + item);

        notifyAll();
    }
}
