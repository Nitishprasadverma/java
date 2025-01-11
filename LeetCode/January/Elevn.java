package January;

import java.util.HashMap;
import java.util.Map;

public class Elevn {
    public static void main(String[] args) {
        System.out.println(minMoves(19, 2));
        String s =
"1111110011101010110011100100101110010100101110111010111110110010";
System.out.println(binaryToDecimal(s));
    }

    public boolean canConstruct(String s, int k) {
        if(s.length() == k ) return true;
        if(s.length() < k ) return false;
        

        HashMap<Character,Integer> charFreq = new HashMap<>();
        for(char c : s.toCharArray()){
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;

        for(Map.Entry<Character,Integer> entry : charFreq.entrySet()){

            int eachCharFreq = entry.getValue();

            if(eachCharFreq % 2 == 1){
                oddCount++;
            }
        }

        if(oddCount > k) return false;
        return true;

    }


    // Iterative Approach
   static public int minMoves(int target, int maxDoubles) {
        int moves = 0;

        while (target > 1) {
            if (target % 2 == 0 && maxDoubles > 0) {
                // If target is even and we can still double, halve the target
                target /= 2;
                maxDoubles--;
            } else if (maxDoubles == 0) {
                // If no doubling is allowed, reduce target to 1 directly
                moves += target - 1;
                break;
            } else {
                // If target is odd, decrement it
                target--;
            }
            moves++;
        }

        return moves;
    }

    //Stack Overflow Recursive Approach
//   static  public int minMoves(int target, int maxDoubles) {
//         if(target == 1) return 0;

//         if(target % 2 ==0 && maxDoubles >0){
//             return 1 + minMoves(target / 2, maxDoubles - 1);
//         }else{
//             return 1 + minMoves(target - 1, maxDoubles);
//         }
//     }


public static long binaryToDecimal(String binary) {
    long decimal = 0;

    // Traverse the binary string from left to right
    for (int i = 0; i < binary.length(); i++) {
        // Get the current bit (0 or 1) and   // Get the current bit (0 or 1) and its position from the right
             char bit = binary.charAt(i);
             // Shift left and add the bit value (0 or 1)
             decimal = decimal * 2 + (bit - '0');
        
    }

    return decimal;
}


}
