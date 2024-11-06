
public class IsPreString {
    public static void main(String[] args) {
        String[] words = { "i", "love", "leetcode", "apples" };
        String[] words1 = { "apples", "i", "love", "leetcode" };
        System.out.println(isPrefixString(words, "iloveleetcode"));
        System.out.println(isPrefixString(words1, "iloveleetcode"));

    }

    static boolean isPrefixString(String[] words, String s) {
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word);
            if (sb.toString().equals(s)) {
                return true;
            }
        }
        return false;
    }
}
