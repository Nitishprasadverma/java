public class validMountain {
    public static void main(String[] args) {

        //941
        int[] arr ={3,5,5};
        System.out.println(validMountainArray(arr));
    }

    static  boolean validMountainArray(int[] arr) {
        int n = arr.length;
        
        if(n == 2) return false;
        
        int i = 0;
        
    
       
        
       
        // checking for strictly increasing and updatting our i 
        while(i < n - 1 && arr[i] < arr[i + 1]){
            i++;
        }
         if(i == 0 || i == n - 1) return false;
        
        while(i < n - 1 && arr[i] > arr[i + 1]){
            i++;
        }
        
        
        
        return i == n - 1;
        
    }
}
