import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumber {
    

// 386. Lexicographical Numbers

// Given an integer n, return all the numbers in the range [1, n] sorted in lexicographical order.

// You must write an algorithm that runs in O(n) time and uses O(1) extra space. 

 

// Example 1:

// Input: n = 13
// Output: [1,10,11,12,13,2,3,4,5,6,7,8,9]





      public void solve(int currNum, int n,List<Integer> result ){
        if(currNum > n) return;
        result.add(currNum);

        for(int i = 0; i <= 9; i++){
            int newNum = (currNum * 10) + i;

            solve(newNum, n, result);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= 9; i++){
            solve(i, n, result);
        }
        return result;
    }
}
