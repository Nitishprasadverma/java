import java.util.*;
public class FlipingImage {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int ans[][] = rev(array);
       
        for(int row = 0; row < ans.length; row++){
            System.out.println(Arrays.toString(ans[row])); // shortest way to print the output.
        }
    }

    static int[][] FlipAnImaage(int[][] image){
       int ans[][] = reverse(image);
       for(int i = 0; i<ans.length ; i++){
        for(int j = 0; j<ans[i].length; j++){
            if(ans[i][j] == 0){
                image[i][j] = 1;
            }
            else{
                image[i][j] = 0;
            }
        }
       }

       return image;
    }

    static int[][] rev(int arr[][]){

        for(int i = 0; i < arr.length; i++){
            int end = arr[i].length -1;
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = arr[i][end];
                arr[i][end] = arr[i][j];
                end--;
            }
        }
        return arr;
    }
    static int[][] reverse(int[][] arr){

        for(int i =0; i< arr.length; i++){

            int start = 0;
            int end = arr[i].length -1;

            while(start <= end){
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start ++;
                end--;
            }
        }
return arr;
    }
}
