import java.util.*;

public class arrayConcate {
    public static void main(String[] args) {
        int[] num = {2,24,4,5,6};
        int[] ans = getconcate(num);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getconcate(int[] num){
        int newArray[] = new int[2*num.length];
        for(int i = 0; i < num.length; i++) {
          newArray[i] = newArray[i + num.length] = num[i];
        }
        return newArray;
    }
}
