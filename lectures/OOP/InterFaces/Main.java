package lectures.OOP.InterFaces;

public class Main {
    public static void main(String[] args) {
        // Car obj = new Car();
        // obj.acc();
        // obj.start();
        // obj.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

    }
}
