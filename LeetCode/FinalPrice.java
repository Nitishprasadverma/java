//1475

import java.util.Arrays;

public class FinalPrice {
    public static void main(String[] args) {
        int[] arr = {8,4,6,2,3};
       int[] ans = finalPrices(arr);
       System.out.println(Arrays.toString(ans));
    }

    static int[] finalPrices(int[] prices) {
        

        for(int i =0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                if(prices[i] >= prices[j]){
                    prices[i] = prices[i] -  prices[j];
                break;
                }
            }
        }
        return prices;
    }
}
