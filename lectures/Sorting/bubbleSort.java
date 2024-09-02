import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
int arr[] = {-4,7,9,-1,0,3,10};
 bubbleSorts(arr);
System.out.println(Arrays.toString(arr));
    }

    static void bubbleSorts(int arr[]) {
        boolean swapperOccurs = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapperOccurs = true;
                }
            }

            if(swapperOccurs == false){
                break;
            }
        }
    }
}
