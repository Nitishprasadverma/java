import java.util.HashMap;

public class subArrayKdiff {
    public static void main(String[] args) {
        
    }


    //Bruteforce TLE
    public int subarraysWithKDistinct(int[] s, int k) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); 

        for (int i = 0; i < s.length; i++) {
            map.clear();
            for (int j = i; j < s.length; j++) {
                map.put(s[j], map.getOrDefault(s[j], 0) + 1);

                if (map.size() == k) {
                    count++;
                } else if(map.size() > k) break;
            }
        }
        return count;
    }

    //Better

    public int subarraysWithKDistinctg(int[] s, int k) {
       if(k == 0) return 0;

       int atMostK = subarraysWithKDistinctBetter(s, k);
       int atMostKminus1 = subarraysWithKDistinctBetter(s, k -1);
       return atMostK - atMostKminus1;
    }
    public int subarraysWithKDistinctBetter(int[] s, int k){
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int l = 0, r = 0;
        while (r <= s.length) {
            map.put(s[r], map.getOrDefault(s[r], 0) + 1);

            while (map.size() > k) {
                map.put(s[l], map.get(s[l]) - 1);

                if (map.get(s[l]) == 0) {
                    map.remove(s[l]);
                }
                l++;
            }

           count = count + (r-l+1);
            r++;
        }
        return count;
    }
}
