package January;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class SecondJan {
    public static void main(String[] args) {
        int[] arr = {4,9,23,4};
int mass =5;
       System.out.println(asteroidsDestroyed(mass, arr));
// System.out.println(ans);
        // System.out.println(Arrays.toString(ans));
      
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        int n = words.length;
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            String word = words[i];
            char start = word.charAt(0);
            char end = word.charAt(word.length() - 1);

            // checking if the word start and end with vowels or not

            if (vowels.contains(start) && vowels.contains(end)) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }

        // query processing
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            result[i] = prefix[end + 1] - prefix[start];
        }

        return result;
    }

    static int[] nextSmallerElement(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
       
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && nums[i] <= st.peek()) {
                st.pop();
            }

            if (!st.isEmpty() && st.peek() < nums[i]) {
                ans[i] = st.peek();
            }else{
                ans[i] = -1;
            }

            st.push(nums[i]);
        }
        return ans;
    }


   static public int sumSubarrayMins(int[] arr) {
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        int total = 0;
        int mod = (int)(1e9 +7);

        for(int i = 0; i < arr.length; i++){
           int left = i - pse[i];
           int right = nse[i] - i;

           total = (total + ( right * left  *arr[i]) % mod) % mod;
        }
        return total;
    }

    static int[] findNSE(int[] arr){
        int [] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=  arr.length - 1; i>=0; i--){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.empty()?arr.length:st.peek();
            st.push(i);

        }
        return ans;
    }

    static int[] findPSE(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();


        for(int i = 0; i < arr.length; i++){
            while (!st.empty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            ans[i] = st.empty() ? -1:st.peek();
            st.push(i);
        }
        return ans;

    }


   static public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < asteroids.length; i++){
            if(asteroids[i] > 0) st.push(asteroids[i]);else{
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])) {
                    st.pop();
                }

                if(!st.isEmpty() && st.peek() == Math.abs(asteroids[i])) st.pop();
                else if(st.isEmpty() || st.peek() < 0) st.push(asteroids[i]);
            }
            }

            int[] ans = new int[st.size()];
            for(int i = st.size() - 1; i >= 0; --i ){
                ans[i] = st.pop();
            }
            return ans;
        }

      static  public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long massL = mass;
        for(int i = 0;i < asteroids.length;i++){
            if(massL >= asteroids[i]){
                massL += asteroids[i];
            }else{
                return false;
            }
        }

        return true;
        }
    }

