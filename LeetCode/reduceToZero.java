public class reduceToZero {
    public static void main(String[] args) {
        System.out.println(numberOfStepsToReduceToZero(8));
    }

    static int numberOfStepsToReduceToZero(int num){
        if(num == 0) return 0;
         
        
        if(num % 2 == 0){
            
           return 1+ numberOfStepsToReduceToZero(num / 2);
        }else{
           
            
           return 1 + numberOfStepsToReduceToZero(num - 1);
        }
        
    }
}
