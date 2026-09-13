package Annotation;
public class Main{

    public  interface Bird {
    
    public  boolean fly();    
    }

    public class Eagle implements Bird {
    
        @Override 
        public  boolean fly1(){
            
        }
    }
    
    // public static void main(String[] args) {
    //     Moblie mobileObj = new Moblie();

    //     mobileObj.dummyMethod();

        
    // }

    //supressWarnings
     @SuppressWarnings("deprecation") 

     // ye @SuppressWarnings("deprecation")  main out class pe bhi laga skte hai ya fir 
      //main pe lagyaenge toh @SuppressWarnings("all") karke bhi use kr skte hai
    public static void main(String[] args) {
        Moblie mobileObj = new Moblie();

        mobileObj.dummyMethod();

        
    }

    //@FunctionalInterface:  restrict krta hai ki ek interface mein ek se jada abstract method na ho

    // @FunctionalInterface 
     // public interface Bird1 {
     // public boolean fly();
     // public  void eat();
        
     // }
}
