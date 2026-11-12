package Threading.LEC3;

public class SeemaMAin {

    public static void main(String[] args) {
        
         SemaPhoreResource  resource = new SemaPhoreResource();
    Thread th1 = new Thread(() ->{
        resource.producer();
    });
    
    Thread th2 = new Thread(() ->{
        resource.producer();
    });
    Thread th3 = new Thread(() ->{
        resource.producer();
    });
    Thread th4 = new Thread(() ->{
        resource.producer();
    });

    th1.start();
    th2.start();
    th3.start();
    th4.start();
    }
   

}
