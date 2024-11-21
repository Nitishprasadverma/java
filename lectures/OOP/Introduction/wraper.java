package OOP.Introduction;

public class wraper {
   public static void main(String[] args) {
    int a =10;
    int b =32;
    Integer num = 24;

    // not swap bcz it's copy is paased not refeclect ot=utside of the swap function 
    swap(a, b);

    System.out.println(a + " " + b);

    final int bonus = 4;
    // bonus = 4; // can not modified final 

    final A nitish = new A("Nitish Verma");
    nitish.name = "other name";

    //when a non primitive is final , you cannot reassigned it
    // nitish = new A("new object");

    A  obj = new A("nirjnaj");
    System.out.println(obj.name);

    for (int i = 0; i < 1000000000; i++) {
        obj = new A("Random name");
    }
    
   } 


  static void swap(int a, int b){
    int temp = a;
    a =b;
    b = temp;
   }
}


class A {
    final int num = 10; 
    String name;
    // giving error bcz final variable must have to be initialize
    
    // always initialize while declaring final variable


    public A(String name) {
        //        System.out.println("object created");
                this.name = name;
            }

    @Override protected void finalize() throws Throwable{
        System.out.println("object is destroyed");
    }
}

