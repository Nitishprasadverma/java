import java.util.Arrays;

public class merge {
   public static void main(String[] args) {
    int[] nums1 = {1,2,3,0,0,0};
    int nums2[] = {2,5,6};
    int n = 3, m =3 ;
    mergeSort(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));
   } 

   static  void mergeSort(int[] nums1, int m, int[] nums2, int n){
    int p = n + m - 1;
        int i = m - 1;
        int j = n  - 1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[p] = nums1[i];
                i--;
            }else{
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }

        while(j >= 0){
            nums1[p] = nums2[j];
            j--;
            p--;

        }
   }
}
