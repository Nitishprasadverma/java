public class Reach {
    public static void main(String[] args) {
        int target = 2;
        System.out.println(reachToTarget(target));
    }

    static int reachToTarget(int target){
        int sum = 0;
        int move = 0;
         target = Math.abs(target);
        while(sum < target || (sum - target) % 2 != 0  ){
            move++;
            sum += move;
        }
        return move;
    }

}
