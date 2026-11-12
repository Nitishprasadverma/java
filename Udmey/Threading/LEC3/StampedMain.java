package Threading.LEC3;

public class StampedMain {

    public static void main(String[] args) {
        SharedResStamped resource = new SharedResStamped();

    Thread th1 = new Thread(() ->{
        resource.producer();
    });

    Thread th2 = new Thread(() ->{
        resource.producer();
    });

    Thread th3 = new Thread(() ->{
        resource.consume();
    });

    th1.start();
    th2.start();
    th3.start();
    }
}
