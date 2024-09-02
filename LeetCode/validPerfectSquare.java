// import java.util.*;
public class validPerfectSquare {
    public static void main(String[] args) {
        int num = 17;
        boolean ans  = isValidPerfectSquare(num);
        System.out.println(ans);
    }

    static boolean isValidPerfectSquare(int num){
        if((num < 1 ) && (num>= Integer.MAX_VALUE)){
            return false;
        } 
        int start  = 1;
        int end = num;
        while(end <= num){
            int mid  = start + (end - start)/2;
            int midSquare = mid * mid;

            if(midSquare == num){
                return true;
            }
            else if(midSquare > num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}
