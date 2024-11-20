public class minInRoatedArr {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };
        System.out.println(findMin(arr));
    }

    static int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            // if left part of array is sorted
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);

                // eliminate left half
                low = mid + 1;
            } else {// if right part is sorted

                ans = Math.min(ans, nums[mid]);
                // eliminate right half
                high = mid - 1;
            }
        }
        return ans;
    }
}
