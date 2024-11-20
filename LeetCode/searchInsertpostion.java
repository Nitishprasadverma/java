public class searchInsertpostion {
    public static void main(String[] args) {
        int[] arr = {1,3,5,5,24};

       System.out.println(searchInsert(arr, 7));
    }

   static int searchInsert(int[] nums, int target) {
        int ans  = nums.length;
        int low = 0, high = ans - 1;
        while(low <= high){
            int mid = low +(high - low ) /2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
