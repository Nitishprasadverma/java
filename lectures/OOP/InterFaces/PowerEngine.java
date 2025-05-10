package OOP.InterFaces;

public class PowerEngine  implements Engine{

    @Override
    public void start() {
       System.out.println("Power engine started");
        
    }

    @Override
    public void stop() {
        System.out.println("Power Engine stoped");
        
    }
    @Override
    public void acc() {
        System.out.println("Power Engine accelerate");
        
    }
    
}
