package lectures.OOP.AbstractDemo;

public class Son extends Parent{

    Son(int age){
        super(age);
        
    }
    @Override
    void career(String name){
        System.out.println("i'm going to be a " + name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("i love " + name + " she is " + age);
    }
}
