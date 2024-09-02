// import java.util.*;

public class HighestAltitude {
    public static void main(String[] args) {
        int arr[] = {-4,-3,-2,-1,4,3,2,2};
        int ans = HighestAltitudes(arr);
        System.out.println(ans);


    }
    static int HighestAltitudes(int[] arr){
        int minAltitude = 0;
        int heighestAltitude = 0;
        for(int i = 0; i < arr.length; i++){
            minAltitude += arr[i];
        
            if(minAltitude > heighestAltitude){
                heighestAltitude = minAltitude;
            } 
        }
        return heighestAltitude;
    }
}

