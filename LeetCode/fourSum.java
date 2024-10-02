import java.util.*;
public class fourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println(fourSumBrute(nums));
    }

    static List<List<Integer>> fourSumBrute(int[] nums){
        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0 ; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; j < nums.length; k++){
                    

                    for(int l = k + 1; l < nums.length; l++){

                        long sum = (long)nums[i] + nums[j];
                        sum += nums[k];
                        sum += nums[l];
                        if(sum== 0){
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
                    
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
