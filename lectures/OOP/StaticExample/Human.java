package lectures.OOP.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean maritailStatus;
    static long population;


    static void message(){
        System.out.println("hello i'm static method messaage");

        // System.out.println(this.age); //this  can't use over here  because this points to an object while this message is an static method which in not depen d on an object then u can use something over here which  is dependent on object 
    }
    public Human(int age, String name, boolean maritailStatus, int salary  ){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.maritailStatus = maritailStatus;
        Human.population += 1;
    }
}
