package lectures.OOP.singleton;

public class Main {
//   Singleton obj = new Singleton(); //error bcz singleton is define as private calss there

Singleton obj = Singleton.getInstance();
Singleton obj1 = Singleton.getInstance();
Singleton obj2 = Singleton.getInstance();

// all theese three reference variable is pointing to just one object
}
