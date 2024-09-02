// package LeetCode;

public class maxWealth {
    public static void main(String[] args) {
        int[][] accounts = { 
            {2,8,7},{7,1,3},{1,9,5}
                
        };
        int ans = maxWealths(accounts);
        System.out.println(ans);
    }

    static int maxWealths(int[][] accounts) {
        int max = 0;
        int personSum = 0;

        for (int person = 0; person < accounts.length; person++) {
            for (int account = 0; account < accounts[person].length; account++) {
                personSum += accounts[person][account];
            }

            if (personSum >= max) {
                max = personSum;
                
            }
            personSum = 0;
        }
        return max;
    }
}
