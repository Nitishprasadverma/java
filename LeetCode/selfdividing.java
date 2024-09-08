import java.util.*;

public class selfdividing {
    public static void main(String[] args) {
    int left = 47;
    int right = 85;
    System.out.println(selfDividingNumber(left, right));
    }


   static List<Integer> selfDividingNumber(int left, int right){
           ArrayList<Integer> list = new ArrayList<>();
           for(int i =  left; i <= right ; i++){
            if(checkNumberIsDividedBySelfDigit(i) == true){
                list.add(i);
            }
           }
           return list;
   }

   static boolean checkNumberIsDividedBySelfDigit(int num){
    int temp = num;
    while(num > 0){
        int rem = num % 10;
        if(rem == 0) return false;
        if(temp % rem != 0){
            return false;
        }
        num = num / 10;
    }
    return true;
   }
   
}
