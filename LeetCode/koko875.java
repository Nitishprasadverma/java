import java.util.Arrays;

public class koko875 {
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        System.out.println(minEatingSpeed(arr, 6));
    }
    static int minEatingSpeed(int[] piles, int h) {
        int high = Arrays.stream(piles).max().getAsInt();
        int low = 1;

        while(low < high){
            int  mid = low + (high - low) / 2;

            int requiretime = totalHrReq(piles, mid);

            if(requiretime <= h){

                // include high in search  high = mid. This ensures that mid is not skipped if it's the valid minimum speed.
                high = mid;
            }else{
                low = mid;
            }
        }
        return low;
    }

    static int totalHrReq(int[] arr, int perHrRate){
        int totaltime = 0;
        for(int i = 0; i < arr.length; i++){
            totaltime += (arr[i] + perHrRate - 1) / perHrRate; 
        }
        return totaltime;
    }

}
