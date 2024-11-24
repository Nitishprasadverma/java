package lectures.OOP.Properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(4);
        Box box3 = new Box(1.0,2.3,3.9);

        Box box4 = new Box(box3);
        // System.out.println(box1.h + " " + box1.l + " " + box1.w);
        // System.out.println(box2.h + " " + box2.l + " " + box2.w);
        // System.out.println(box3.h + " " + box3.l + " " + box3.w);
        // System.out.println(box4.h + " " + box4.l + " " + box4.w);


        BoxWeight boxWgt1 = new BoxWeight();
        System.out.println(boxWgt1.h + " " + boxWgt1.w);
        
    }
}
