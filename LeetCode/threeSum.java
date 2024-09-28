import java.util.*;
public class threeSum {
    public static void main(String[] args) {
        int[]  nums = {-1,0,1,2,-1,-4};
        System.out.println(optimal(nums));

        // System.out.println(better(nums));
    }
    static List<List<Integer>> ThreeSumBrute(int[] nums){
        Set<List<Integer>> st = new HashSet<>();

        for(int i = 0 ; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; j < nums.length; k++){
                    
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);

                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    static List<List<Integer>> better(int nums[]){
        Set<List<Integer>> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            Set<Integer> haSet = new HashSet<>();
            for(int j = i + 1; j < nums.length; j++){
                int third = -(nums[i] + nums[j]);

                if(haSet.contains(third)){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                haSet.add(nums[j]);
            }
        }
        List<List<Integer>> ans  = new ArrayList<>(st);
        return ans;
    }


    static List<List<Integer>> optimal(int nums[]){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i <nums.length; i++){
            // removing i th duplicates

            if(i != 0 && nums[i] == nums[i - 1]) continue;

            // moving pointers j and k;

            int j = i + 1;
            int k = nums.length - 1;

            while ( j < k) {
                int sum = nums[i] + nums[j]+ nums[k];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                } 
                else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while (j < k && nums[j] == nums[j - 1]) j++ ;

                    while ( j < k && nums[k] == nums[k + 1]) k--; 
                }
            }
        }
        return ans;
    }
}
