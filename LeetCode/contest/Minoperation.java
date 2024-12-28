package contest;

public class Minoperation {
    public static void main(String[] args) {
        int[] nums = {2,2,13};
        System.out.println(minimumOperations(nums));
    }
    static int minimumOperations(int[] nums) {
        int id = 0;
        int op=  0;
        int d = 1;
        if(nums.length == 3){
            for(int i = 0; i < nums.length; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] == nums[j]) op++;
                     return 1;
                }
                
            }
        }
        for(int i= id; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == nums[i] && i < nums.length && i < nums.length){
                  
                   int cou = 3 + d++ * 3 - 3;
                    op++;
                    i = cou;
                    // break;
                }
            }
        }
        return op;
    }
}
