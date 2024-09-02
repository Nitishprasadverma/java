public class firstOccurance {
    public static void main(String[] args) {
        String haystack = "leetleetocode";
        String needle = "leeto";
        System.out.println(firstOccuranceOfString(haystack, needle));
    }

    static int firstOccuranceOfString(String haystack, String needle){
        // int count = 0;
        int index = 0;
        while((index = haystack.indexOf( needle , index)) != -1){
            //  index += word.length();
             return index;
        }
        return -1;
    }
}
