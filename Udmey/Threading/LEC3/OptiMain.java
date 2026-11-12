package Threading.LEC3;

public class OptiMain {
    public static void main(String[] args) {
        SharedOptimistic resource = new SharedOptimistic();

        Thread th1 = new Thread(() ->{
            resource.producer();
        });

        Thread th2 = new Thread(() ->{
            resource.consumer();
        });

        th1.start();
        th2.start();
    }
}
