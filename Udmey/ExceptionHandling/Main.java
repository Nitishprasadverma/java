package ExceptionHandling;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Main sampleObj = new Main();
        sampleObj.method1();

        //classCastException
        Object  val = 0;
        System.out.println((String) val);

        //Arithmetic exception
        int val1 = 5 /0;

        //ArrayIndexOutOfBound exception
        int[] arr = new int[2];
        System.out.println(arr[2]);

        //StringIndexOutOfBound exception

        String str = "Hello";
        System.out.println(str.charAt(5));

        //NullPointer Exception

        String str1 = null;
        System.out.println(str1.charAt(0));

        //IllegalArgumentException

        int val3 = Integer.parseInt("abc"); //NumberformatException
    }

    private  void method1(){
        method2();
    }
    private void method2(){
        method3();
    }
    private void  method3(){

        //ArithmeticException here divided  by zero
        int b = 5 /0;
    }
}
