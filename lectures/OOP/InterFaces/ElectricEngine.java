package lectures.OOP.InterFaces;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
       System.out.println("Electric engine started");
        
    }
    @Override
    public void stop() {
        System.out.println("Electric engine stope");
        
    }
    @Override
    public void acc() {
        System.out.println("Electric engine acceleret");
        
    }
}
