

public class unique {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1,2, 3,5};
        int [] num = {-1,2,3,1,-2,-3,5};
        System.out.println(ans(nums));

    System.out.println(positive(num));
    }

    static int ans(int[] arr){
        int quniue = 0;
        for(int n :arr){
            quniue ^= n;
        }
        return quniue;
    }


    // fucntion for the array in which every element is occuring twice and one of them is -ve and only one number is occuring once find that  number.


    static int positive(int[] arr){
        int sum = 0;
        for(int n:arr){
            sum += n;
        }
        return sum;
    }
}

