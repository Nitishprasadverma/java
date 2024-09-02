class singleNumber{
    public static void main(String[] args){
        //appearing three times
        int[] arr = {2,2,3,2};

        // what if appear for times 
        int[] nums= {2,2,2,1,3,1,3,1,1,3,3,2,5};
        
        System.out.println(appearFourtimes(nums));
        // System.out.println(singleNumber_2(arr));
    }

    static int appearFourtimes(int[] nums){
        int[] bitCount = new int[32]; // To store the count of each bit

        // Count the number of 1s at each bit position
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitCount[i] += (num >> i) & 1;
            }
        }

        int result = 0;

        // Construct the unique number from the bit counts
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 4 != 0) { // If the count of bits is not a multiple of 3, it belongs to the unique number
                result |= (1 << i);
            }
        }

        return result;
    }
    static int singleNumber_2(int[] nums){
        //  int ones = 0, twos = 0;

        // for (int num : nums) {
        //     // First appearance: 
        //     // Add num to ones if it's not there in twos
        //     ones = (ones ^ num) & ~twos;
        //     // Second appearance: 
        //     // Add num to twos if it's not there in ones
        //     twos = (twos ^ num) & ~ones;
        // }

        // return ones;




         int[] bitCount = new int[32]; // To store the count of each bit

        // Count the number of 1s at each bit position
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitCount[i] += (num >> i) & 1;
            }
        }

        int result = 0;

        // Construct the unique number from the bit counts
        for (int i = 0; i < 32; i++) {
            if (bitCount[i] % 3 != 0) { // If the count of bits is not a multiple of 3, it belongs to the unique number
                result |= (1 << i);
            }
        }

        return result;
    }
}