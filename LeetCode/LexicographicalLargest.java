public class LexicographicalLargest {


    //https://leetcode.com/problems/find-the-lexicographically-largest-string-from-the-box-i/description/?envType=daily-question&envId=2025-06-04
    public String answerString(String word, int numFriends) {

        int n = word.length();
        if (numFriends == 1)
            return word;

        String result = "";
        int largestPossibleSubString = n - (numFriends - 1);
        for (int i = 0; i < n; i++) {
            int cantakeLength = Math.min(largestPossibleSubString, n - i);
            String sub = word.substring(i, i + cantakeLength);
            if (sub.compareTo(result) > 0) {
                result = sub;
            }

        }

        return result;
    }

    public String answerString1(String word, int numFriends) {
        int n = word.length();
        if (numFriends == 1)
            return word;

        int i = bestStartingPoint(word, n);

        int longestPossibleLength = n - (numFriends - 1);
        int canTakePossible = Math.min(longestPossibleLength, n - i);
        return word.substring(i, i + canTakePossible);
    }

    public int bestStartingPoint(String word, int n) {

        int i = 0; // best starting point
        int j = 1; //

        while (j < n) {
            int k = 0;
            // skipping equal character
            while (j + k < n && word.charAt(i + k) == word.charAt(j + k)) {
                k++;
            }
            if (j + k < n && word.charAt(j + k) > word.charAt(i + k)) {
                i = j; // upadating best starting point
                j = j + 1;
            } else {
                j = j + k + 1; // skipping already checked character
            }
        }

        return i;
    }

}
