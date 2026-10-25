package Threading.LEC2;

public class SharedResource {
    
    boolean isAvailable = false;

    public   synchronized void produce(){
        isAvailable = true;

        System.out.println("Lock Acquired.");

        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            // TODO: handle exception
            //Exception goes here
        }

        System.out.println("Lock Released.");
    }
    
}
