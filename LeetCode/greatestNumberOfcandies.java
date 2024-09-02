import java.util.*;
public class greatestNumberOfcandies {
    public static void main(String[] args) {
        int candies[] = {12,1,12};
        List<Boolean> ans  = kidsWithCandies(candies, 10);
        System.out.println(ans);
    }

     static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
     int maxCandies  = 0;
     for(int candi: candies){
        maxCandies = Math.max(maxCandies, candi);
     }
System.out.println(maxCandies);
     List<Boolean> ans  = new ArrayList<>();
     for(int candi: candies){
        candi += extraCandies;
        if(candi >= maxCandies){
            ans.add(true);
        }
        else{
            ans.add(false);
        }
     }
     return ans;
    }
}
