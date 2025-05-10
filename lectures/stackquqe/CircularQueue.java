package stackquqe;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

   protected int end = 0;
   protected int front = 0;
   protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    } 

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        int removed = data[front++];
        // shifting the item one step ahed in the queue
        front = front % data.length;
        size--;
        
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()){
            throw new Exception("Queue is empty"); 


        }
        return data[front];
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }

        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        }while(i != end);
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(43);
        queue.insert(65);
        queue.insert(37);
        queue.insert(93);
        queue.insert(45);

        queue.remove();
        queue.insert(345);
        queue.display();
    }
}
