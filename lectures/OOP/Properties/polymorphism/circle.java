package OOP.Properties.polymorphism;

public class circle extends shapes{

    // this will run when obj of circle is created
    // hence it is overriding the parent method
    @Override //this is called anoonation
    void area (){
        System.out.println("i'm in circle");
    }
}
