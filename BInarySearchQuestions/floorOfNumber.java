
public class floorOfNumber {
    public static void main(String[] args) {
        int[] arr ={12,15,17,23,26,29,34,37};
        int ans = floorOfNumbers(arr, 10);
        System.out.println(ans);
    }

    static int floorOfNumbers(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if(target<arr[start]){
            return -1;
        }
        while (start <= end) {
            // int middle = (start + end) / 2;
            int middle = start + (end - start)/2;
            if (arr[middle] == target) {
                return middle;
            }
            else if (target > arr[middle]) {
                start = middle + 1;
            }
            else  {
                end = middle - 1;
            }
           
        }
        return arr[end];

    }

}
