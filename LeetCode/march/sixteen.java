
package march;

public class sixteen {
    public static void main(String[] args) {

    }

    // optimal solution
    public long repairCars(int[] ranks, int cars) {
        int maxR = 0;
        for (int i = 0; i < ranks.length; i++) {

            maxR = Math.max(maxR, ranks[i]);
        }

        long l = 1;
          long r = (long) cars * cars * maxR;
        long result = -1;
        while (l <= r) {
            long mid = l + (r - l) / 2;

            if (isPossibleToRepair(mid, ranks, cars)) {
                result = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return result; 
    }

    public boolean isPossibleToRepair(long time, int[] ranks, int cars) {
        long carsFixed = 0;
        for (int i = 0; i < ranks.length; i++) {
             carsFixed += (long) Math.floor(Math.sqrt(time / ranks[i]));
        }
        return carsFixed >= cars;
    }
}
