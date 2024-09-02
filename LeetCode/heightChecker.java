import java.util.*;
public class heightChecker {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(heightCheckerr(arr));
    }

    static int heightCheckerr(int[] heights){
        int count = 0;
        int[] expected = new int[heights.length];
        for(int i = 0; i < expected.length; i++){
expected[i] = heights[i];
        }

        Arrays.sort(expected);

        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
}