package OOP.InterFaces;

public class Car implements Engine, Break {
    @Override
    public void brake() {
        System.out.println("i brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("i stop like a normal car");
    }

    public void acc() {
        System.out.println("i accelerate like a normal car");
    }

}
