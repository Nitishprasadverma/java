
public class MaxRepSubStr {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(countOccurence(sequence, word));
    }

    static int countOccurence(String sequence, String word) {

        int count = 0;
        StringBuilder  sb = new StringBuilder();
        sb.append(word);
        while(sequence.contains(sb) == true){
        count++;
        sb.append(word);
 }
        return count;

        // String add = word;
        // while(sequence.contains(word) == true){
        //     count++;
        //     word += add;
        // }
        // return count;
    }
}
