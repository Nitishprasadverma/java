package OOP.StaticExample;



public class staticInit {
    static int a = 4;
     static int b;

     // will only run once, when the frist obj is create .i.e. when the class is loaded for the first time
     static {
        System.out.println("I'm ins tatic block");

        b = a * 5;
     }

     public static void main(String[] args) {
        staticInit obj = new staticInit();
        System.out.println(obj);
        System.out.println(staticInit.a + " " + staticInit.b);

        staticInit.b += 3;
        System.out.println(staticInit.a + " " + staticInit.b);

        staticInit obj2 = new staticInit();
        System.out.println(obj2);
        System.out.println(staticInit.a + " " + staticInit.b);

     }
}
