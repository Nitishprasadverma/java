public class cntPrefi {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixes(words, s));
    }

    static int countPrefixes(String[] words, String s) {
        int cnt = 0;
        for(int i = 0; i< words.length;i++){
            if(s.startsWith(words[i])) cnt++;
        }
        return cnt;
    }
}
