public class perfectSquare {
    public static void main(String[] args) {
        System.out.println(isPerfectSqaure(28));
    }

    static boolean isPerfectSqaure(int num){
        int sum = 0;
        for(int i = 1; i <= num / 2; i++){
            if(num  % i == 0){
                sum += i;
            }
        }
       return (sum == num);
    }
}
