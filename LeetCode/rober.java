// import java.util.*;
public class rober {
    public static void main(String[] args) {
        int[] num = {2,7,9,3,1};
        int ans = robedInCircularArray(num);
        System.out.println(ans);
        System.out.println(robedInNormalArraay(num));

    }

    static int robedInNormalArraay(int [] nums){
        int robbed = 0;
        int noRobbed = 0;
        for(int i = 0; i < nums.length; i++){
            int newRob = noRobbed+ nums[i];
            int newNoRobbed = Math.max(robbed, noRobbed);
            robbed = newRob;
            noRobbed = newNoRobbed;
       
        }
        return Math.max(robbed, noRobbed);
    }
    static int robedInCircularArray(int[] nums){
       
        int robbed = 0;
        int noRobbed = 0;
        int rb = 0;
        int nrb = 0;
        int maxin  =0;
        int maxout = 0;
        for(int i = 0; i < nums.length -1; i++){
            int newRob = noRobbed+ nums[i];
            int newNoRobbed = Math.max(robbed, noRobbed);
            robbed = newRob;
            noRobbed = newNoRobbed;
        maxin = Math.max(robbed, noRobbed);
        // System.out.println(maxin);
        }
        int max = maxin;
        // System.out.println(max);

        for(int i = 1; i < nums.length; i++){
            int newRob = nrb+ nums[i];
            int newNoRobbed = Math.max(rb, nrb);
            rb = newRob;
            nrb = newNoRobbed;
        maxout = Math.max(rb, nrb);
        // System.out.println(maxin);
        }
        int max2 = maxout;
        // System.out.println(max2);
        return Math.max(max2, max);
    }
}
