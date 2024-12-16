package lectures.OOP.exceptionHandling;

public class Main {

    public static void main(String[] args) {
        // int a =20, b= 0;
        // System.out.println(a/b);  Arithmetic exception

        try{
            // int c = a /b;

            String name = "nitish";
            if(name.equals("nitish")){
                throw new MyException("name is nitish");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
        
        
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("normal exception");
        }
        
        finally{
            System.out.println("i always run regardless of condition meets or not");
        }
    }

    static int divided(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("please do not divided by zero");
        }
        return a /b;
    }
}