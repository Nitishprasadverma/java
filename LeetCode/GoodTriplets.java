// import java.util.*;

public class GoodTriplets {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 1, 1, 9, 7 };
        System.out.println(countGoodTriplets(arr, 7, 2, 3));
    }

    static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int triplets = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int _first = Math.abs(arr[i] - arr[j]);
                    int second = Math.abs(arr[j] - arr[k]);
                    int third = Math.abs(arr[i] - arr[k]);
                    if ((_first <= a) && (second <= b) && (third <= c)) {
                        triplets += 1;
                    }
                }
            }
        }

        return triplets;
    }
}

