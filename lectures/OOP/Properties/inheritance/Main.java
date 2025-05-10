package OOP.Properties.inheritance;

public class Main {
    public static void main(String[] args) {
    //     Box box1 = new Box();
        
    //     Box box2 = new Box(4);
    //     Box box3 = new Box(1.0,2.3,3.9);

    //     Box box4 = new Box(box3);
    //     // System.out.println(box1.h + " " + box1.l + " " + box1.w);
    //     // System.out.println(box2.h + " " + box2.l + " " + box2.w);
    //     // System.out.println(box3.h + " " + box3.l + " " + box3.w);
    //     // System.out.println(box4.h + " " + box4.l + " " + box4.w);


    //     BoxWeight boxWgt1 = new BoxWeight();
    //     // System.out.println(boxWgt1.h + " " + boxWgt1.w);

    //     BoxWeight boxWeight = new BoxWeight(2,3,4,5);

    //     Box box5 =  new BoxWeight(2,3,4,5);
    //    // System.out.println(box5.weight); // can not access subclass property
    //      System.out.println(box5.w);

        //there are many variables in both parent and child classes 
        // you are given acess to variable taht are in thr reference type i.e. BoxWeight
        // this also means, that the one your are trying to access shouble be intitialized
        // but here, when the obj itself is of type parent class, how you will call the constructor of child class
        //that is why error
        //  BoxWeight box6 = new Box(2,3,4);
        //  System.out.println(box6);


        BoxPrice box = new BoxPrice(8,5,200);
        
    }
}
