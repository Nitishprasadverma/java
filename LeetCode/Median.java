public class Median {
    public static void main(String[] args) {
      int[]  nums1 = {1,3};
      int[] nums2 = {2};
     
      System.out.println( findMedianSortedArrays(nums1, nums2));
      
    }
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int  i = 0;
        int j  = 0;
        int n1 = nums1.length ;
        int n2 = nums2.length;
        int index2 = (n1 + n2) /2;
        int index1 = index2 - 1;
        int elem1 = -1,elem2 = -1;
        int cntr = 0;

        //checking while we will not be out of both arrays or not traverse both arrays completely
        while(i < n1 && j < n2){

            // if nums1 element is smaller than the nums2
            if(nums1[i] < nums2[j]){
                
                 if(cntr == index1) elem1 = nums1[i];
                 if(cntr == index2) elem2 = nums1[i];
                 cntr++;
                 i++;
            }else{
                //if nums2 element is smaller than the nums1
                if(cntr == index2)  elem2 = nums2[j];
                if(cntr == index1) elem1 = nums2[j]; 
                cntr++;
                j++;
            }
            
        }
//if array array1 is remaing 
        while(i < n1){
           if(cntr == index1) elem1 = nums1[i];
           if(cntr == index2) elem2 = nums1[i];
           cntr++;
           i++; 
        }

        // if array2 is remaing for traversing
        while(j < n2){
            if(cntr == index2)  elem2 = nums2[j];
            if(cntr == index1) elem1 = nums2[j]; 
            cntr++;
            j++;
        }
        // if array size is odd size then directly return the element 2 as         it would be that no need to compute with num1
        if((n1+n2) % 2 == 1) return elem2;
        return (double) ((double)(elem1 + elem2)) /2.0;
    }
}
