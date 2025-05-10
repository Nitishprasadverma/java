package OOP.Properties.polymorphism;

public class Main {
   public static void main(String[] args) {
    shapes shape = new shapes();
    circle circles = new circle();
    Square square = new Square();
    
    shape.area();
    circles.area();
    square.area();
   } 
}
