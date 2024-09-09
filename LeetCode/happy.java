
public class happy {

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }


    public static boolean isHappy(int n) {
        // two pointer method
        int slow = n;
        int fast = squareOfDigit(n);  // Fast pointer moves one step ahead
        
        // Loop until the two pointers meet
        while (fast != 1 && slow != fast) {
            slow = squareOfDigit(slow);       // Move slow pointer by 1 step
            fast = squareOfDigit(squareOfDigit(fast));  // Move fast pointer by 2 steps
        }
        
        // If fast pointer reaches 1, it's a happy number
        return fast == 1;
    }

    static int squareOfDigit(int n){
        int sum = 0;
        while(n > 0){
            int rem  = n % 10;
            sum  += rem * rem;
            n /= 10;
        }
        return sum;
        
    }
}