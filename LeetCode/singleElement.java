public class singleElement {
    public static void main(String[] args) {
int[] arr = {1,1,2,2,3,3,4,5,5,6,6};
System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums) {

        int n = nums.length;

        // edge cases handling

        // if size of the array is 1
        if (n == 1)
            return nums[0];
        // start index
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        // for last index
        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];

        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];

            if ((mid % 2) == 1 && nums[mid - 1] == nums[mid])
                ;


                //elimination of left half
            if ((mid % 2 == 1) && nums[mid - 1] == nums[mid] || (mid % 2 == 0) && nums[mid] == nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;//elimination of right half
            }
        }
        return -1;
    }
}
