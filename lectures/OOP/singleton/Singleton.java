package OOP.singleton;

public class Singleton {
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance() {
        // check wether 1 obj only is created or not

        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
