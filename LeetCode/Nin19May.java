import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Nin19May {


//     119. Pascal's Triangle II
// Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:





    class Solution {
    public List<Integer> getRow(int rowIndex) {
//         List<List<Integer>> result = new ArrayList<>(rowIndex);

//         for(int i = 0; i <= rowIndex; i++){
//             List<Integer> row = new ArrayList<>();

//             for(int j = 0; j <= i; j++){
//                 if(j == 0 || j == i) row.add(1);
//                 else {
//                     int num = result.get(i - 1).get(j) + result.get(i - 1).get(j - 1);
//                     row.add(num);
//                 }
//             }
//             result.add(row);
//         }

// List<Integer> ans = result.get(rowIndex);
//        return ans;



//Space optimization code
List<Integer> prev = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) row.add(1);
                else {
                    int num = prev.get(j) + prev.get(j - 1);
                    row.add(num);
                }
            }
            prev = row;
        }
 return prev;
    }

   
}




// 118. Pascal's Triangle

// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


class Solution1 {
    public List<List<Integer>> generate(int numRows) {

       List<List<Integer>> result = new ArrayList<>(); 

       for(int i = 0; i < numRows ; i++){

        List<Integer> rows = new ArrayList<>(i + 1);


        for(int j = 0; j <= i; j++ ){
          if(j == 0 || j == i) rows.add(1);
          else{
            int num = result.get(i - 1).get(j) + result.get(i - 1). get(j - 1);
            rows.add(num);
          }
        }
        result.add(rows);
       }
       return result;
    }
}




// 3024. Type of Triangle

// You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.

// A triangle is called equilateral if it has all sides of equal length.
// A triangle is called isosceles if it has exactly two sides of equal length.
// A triangle is called scalene if all its sides are of different lengths.
// Return a string representing the type of triangle that can be formed or "none" if it cannot form a triangle.


class Solution2 {
    public String triangleType(int[] nums) {
       
    Arrays.sort(nums);

//     if(nums[0] + nums[1] <= nums[2]) return "none";

// if(nums[0] == nums[1] && nums[1] == nums[2]) return "equilateral";
//   else  if(nums[0] == nums[1] || nums[0] == nums[2] || nums[1] == nums[2]) return "isosceles";
    
//     else return "scalene";

Set<Integer> set = new HashSet<>();

for(int num: nums) set.add(num);
if(nums[0] + nums[1] <= nums[2]) return "none";
else if(set.size() == 1) return "equilateral";
else if(set.size() == 2) return "isosceles";
else return "scalene";
    }
}
}
