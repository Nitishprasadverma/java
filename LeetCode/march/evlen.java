
// package march;

package LeetCode.march;

public class evlen {
    public static void main(String[] args) {
        
    }
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int reslt = 0;
        int [] mp = new int[3];

        int i  = 0,j=0;
        while (j < n) {

            char ch = s.charAt(j);
            mp[ch - 'a']++;

            while (mp[0] >0 && mp[1] > 0 && mp[2] > 0) {
                 reslt += (n - j);
                 mp[s.charAt(i) - 'a'] --;
                 i++;
            }
            j++;
            
        }
        return reslt;
    }
}
