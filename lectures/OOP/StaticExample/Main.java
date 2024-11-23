package lectures.OOP.StaticExample;

public class Main {
    public static void main(String[] args) {
        // Human nitish = new Human(19, "Nitish Prasad", false, 190000);
        // Human abhimanyu = new Human(21, "Abhimanyu Mahto", false, 1000000);
        // Human abhimanyu1 = new Human(21, "Abhimanyu1 Mahto", false, 1000000);
        // System.out.println(nitish.name);
        // System.out.println(abhimanyu1.salary);
        // System.out.println(abhimanyu.name);

        // System.out.println(Human.population);
        Main obj = new Main();
        obj.fun2();

    }

    // this fun is not dependent on objects
    static void fun() {

        // greeting(); // you can't use this because it requires an instance but the
        // function are using it in does not depend on instances

        // you can't non static stuff without referencing their instances in a static
        // context

        // hence , here i'm referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // wkt something which is not static, belongs to an object
    void greeting() {
        // fun(); // we can have static method inside non-static method
        System.out.println("Hello world");
    }

}
