import java.util.Arrays;
import java.util.Stack;

public class MinAddToMakeValid {
    public static void main(String[] args) {
        // String s = "))())(";
        // System.out.println(minAddToMakeValid(s));

        // int[] arr = { 2, 4 };
        // int[] arr2 = { 1, 2, 3, 4 };


        // int[] asn = nextGreaterElement(arr, arr2);
        // System.out.println(Arrays.toString(asn));

        int[] nums = {9,8,7,5};
        int[] ans = nextGreaterElements2(nums);
        System.out.println(Arrays.toString(ans));
    }

    static public int minAddToMakeValid(String s) {
        int insertion = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);

            } else {

                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {

                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        insertion++;
                    }
                    i++;
                } else {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        insertion++;
                    } else {
                        insertion += 2;
                    }
                }
            }

        }

        return insertion += stack.size() * 2;

    }

    static public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            int index = findElement(nums2, nums1[i]);
            boolean flag = false;
            while (index < nums2.length) {
                if (nums2[index] > nums1[i]) {
                    ans[i] = nums2[index];
                    flag = true;
                    break;
                }
                index++;
            }
            if (flag != true)
                ans[i] = -1;

        }

        return ans;
    }

    static int findElement(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                return i + 1;

            }
        }
        return -1;
    }
// faild not correct in case of -ve numbers
    static public int[] nextGreaterElements2(int[] nums) {
        int ans[] = new int[nums.length];
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {

                for (int k = 0; k <= nums.length - 2; k++) {
                    if (nums[k] > nums[i]) {
                        ans[i] = nums[k];
                        flag = true;
                        break;
                    }
                }
            }
            
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[j] > nums[i]) {
                    ans[i] = nums[j];
                    flag = true;
                    break;
                }
            }

            if(flag == false){
                boolean flage2 = false;
                for(int j = 0; j < nums.length; j++){
                    if(nums[i] < nums[j]){
                        ans[i] = nums[j];
                        flage2 = true;
                        break;
                    }
                }
                if(flage2 == false){
                    ans[i] = -1;
                    
                }else{
                    flage2 = false;
                }
                
            }else{
                // ans[i] = -1;
                flag = false;
            }
        }
        return ans;

    }

   

}
