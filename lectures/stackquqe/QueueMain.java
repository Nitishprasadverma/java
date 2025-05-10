package stackquqe;

public class QueueMain {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue(5);

        queue.insert(12);
        queue.insert(5);
        queue.insert(6);
        queue.insert(78);
        queue.insert(54);
        queue.display();

        queue.remove();
        queue.display();
    }
}
