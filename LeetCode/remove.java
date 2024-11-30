public class remove {
    public static void main(String[] args) {
        //27
       int[] nums = {3,2,2,3}; int val = 3;
       System.out.println(removeElement(nums, val));

    }

    static int removeElement(int[] nums, int val) {
        
        int k = 0;
        int j = 0;
        // int last = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
                k++;
            }
        }
        return k;
    }
}
