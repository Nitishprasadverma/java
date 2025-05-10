package OOP.StaticExample;

public class innerclasses {

    class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

    }

 
    

    public static void main(String[] args) {
        // Test a = new Test("Nitih"); // can not acess Test here bcz main() is static which in not depended on any
                                    // other instances while Test() is non static type which is depend on some obje
                                    // .i.e here depending on outer innerclasses
        // Test b = new Test("hey");

     

    }
}
