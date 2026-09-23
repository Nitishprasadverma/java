package ExceptionHandling;

// import java.io.FileNotFoundException;

// public class Main1 {
//     // public static void main(String[] args) {
//     //     method1();
//     // }

//     // public static void method1(){
//     //     throw new ClassNotFoundException();  //compiler verfies these types of things during compile time only.
//     // }

//     // Lets try to handle the exception using "throws";


//     // throws tell that this method might through this exception (or might not)so please caller you handle it
//     // public  static void method1() throws ClassNotFoundException {
//     //     throw new ClassNotFoundException();
//     // }

//     //caller class must need to handle that

//     public static void main(String[] args) throws ClassNotFoundException {
//         method1();
//     }

//      public  static void method1() throws ClassNotFoundException {
//         throw new ClassNotFoundException();
//     }
// }



public  class Main1 {

    // public static void main(String[] args) {
    //     method1();
    // }

    // public  static void method1(){
    //     try{
    //         throw new ClassNotFoundException();
    //     }catch(ClassNotFoundException exceptionObject){

    //         //Handle this exception secnario like logging
    //         exceptionObject.printStackTrace();
    //     }
    // } 

    // or

    // public static void main(String[] args) throws ClassNotFoundException{
    //     // try{
    //     //     method1();

    //     // }catch(ClassNotFoundException exceptionObject){
    //     //     //handle it
    //     // }

    //     // try{
    //     //     method1("Dummy");
    //     // }catch(ClassNotFoundException exceptionObject){
    //     //     //handle it
    //     // }catch(InterruptedException exceptionObject){
    //     //     //handle it
    //     // }catch(FileNotFoundException exceptionObject){  // catch block, can only catch exception which can be thrown by try block

            
    //     //     // handle this exception
    //     // }






    //     // try{
    //     //     method1("dummy");
    //     // }catch(ClassNotFoundException exp){
    //     //     // handle the exception here
    //     // }
    //     // finally{
    //     //     //do something here
    //     // }



    //     // try{
    //     //     method1("dummy");
    //     // }finally{

    //     //     //do something here
    //     // }





    //     // try{
    //     //     method2("dummy2");
    //     // }finally{
    //     //     System.out.println("Inside finally block");
    //     // }





    //     //++++++++++throw+++++++++

    //     // try {
            
    //     //     method1();
    //     // } catch (ClassNotFoundException e) {
    //     //     // TODO: handle exception
    //     //     throw e;
    //     // }

    // }

    // public  static void method1() throws ClassNotFoundException{
    //     throw new ClassNotFoundException();
    // }







    // public static void method1(String name) throws ClassNotFoundException, InterruptedException {

    //     if(name.equals("dummy")){
    //         throw new ClassNotFoundException();
    //     }else if(name.equals("interrupted")){
    //         throw new InterruptedException();
    //     }
    // }







    // public static void method1(String name) throws ClassNotFoundException{

    //     if(name.equals("dummy")){
    //         throw new ClassNotFoundException();
    //     }
    // }



    // public  static  void method2(String name){

    // }







    // ++++++++++Throw ++++++++++++++++++++
    // it is used to throw a new exception or to re-throw the exception


    // public  static void method1() throws ClassNotFoundException{

    //     throw new ClassNotFoundException();
    // }








   // ++++++++++Creating custom / user defined Exception class++++++++++



   public static void main(String[] args) {
    

    try {
        method1();
    } catch (MyCustomException e) {
        // TODO: handle exception
        //handle it
    }
   }
   public static  class MyCustomException extends  Exception{
    MyCustomException(String message){
        super(message);
    }
   }

   public static   void method1() throws MyCustomException{

    throw new MyCustomException("some issue arise");
   }

}