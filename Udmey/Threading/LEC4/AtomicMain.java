package Threading.LEC4;

public class AtomicMain {
    public static void main(String[] args) {
        AtomicShared resource = new AtomicShared();

        // for(int i = 0; i < 400; i++){
        //     resource.increment();
        // }

        Thread th1 = new Thread(() ->{

            for(int i  =0; i < 200; i++){
                resource.increment();
            }
        });

        Thread th2 = new Thread(() ->{
            for(int i = 0; i < 200; i++){
resource.increment();
            }
            
        });

        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }


        System.out.println(resource.get());
    }
}
