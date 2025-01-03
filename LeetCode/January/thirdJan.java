package January;

public class thirdJan {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,5,6,8};
        System.out.println(waysToSplitArray(arr));
        System.out.println(pivotIndex(arr));
        System.out.println(findMiddleIndex(arr));
    }

    //POD Leetcode medium 
  static  public int waysToSplitArray(int[] nums) {
        long totalSum = 0; 
        long leftSum = 0;
        int count =0;
        for(int num : nums){
            totalSum += num;
        }

        for(int i = 0; i < nums.length - 1; i++){
            leftSum += nums[i];

            totalSum -= nums[i];
            if(leftSum >= totalSum) count++;
        }
        return count;
    }
    //724easy
    static public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int rightSum = 0;
        int leftSum =0;
        for(int num : nums){
            totalSum += num;
        }

        for(int i = 0;i < nums.length ;i++){
            
            rightSum = totalSum - leftSum- nums[i];

            if(leftSum == rightSum){
                return i;
  
            }

            leftSum += nums[i];
        }
        return -1;
    }
//1991Easy
  static public int findMiddleIndex(int[] nums) {
    int totalSum = 0;
   int rightSum = 0;
   int leftSum =0;
   for(int num : nums){
       totalSum += num;
   }

   for(int i = 0;i < nums.length ;i++){
       
       rightSum = totalSum - leftSum- nums[i];

       if(leftSum == rightSum){
           return i;

       }

       leftSum += nums[i];
   }
   return -1;
}
}
