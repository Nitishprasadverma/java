package lectures.OOP.Properties.inheritance;

public class Box {
    // private int grip;
    double h;
    double w;
    double l;
// double weight;
    Box() {
        this.h = -1;
        this.w = -1;
        this.w = -1;
    }

    // cube
    Box(double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box (Box old){
        this.h = old.h;
        this.l = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("running the box");
    }
//     public BoxWeight(double l, double h, double w, double weight) {
//         // used to initialise values present in parent class
//         super(l, h, w); // what is this? call the parent class constructor
// //        System.out.println(super.weight);
//         this.weight = weight;
//     }
}
