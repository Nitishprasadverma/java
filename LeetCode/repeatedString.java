public class repeatedString {
    public static void main(String[] args) {
        
    String a  = "abcd";
    String b = "cdabcdab";
    System.out.println(repeatedStringMatch(a, b));

    }

    static int repeatedStringMatch(String a, String b) {
        // int repeatCount = 1;
        // StringBuilder repeatedA = new StringBuilder(a);
        // while(repeatedA.length() < b.length()){
        //     repeatedA.append(a);
        //     repeatCount++;
        // }

        // if(repeatedA.toString().contains(b)){
        //     return repeatCount;
        // }
        // repeatedA.append(a);
        // if(repeatedA.toString().contains(b)){
        //     return repeatCount + 1;
        // }
        // return -1;


        String newString = a;
        int count = 1;
        int repeat = b.length() / a.length();
        for(int i = 0; i < repeat + 2; i++){
            if(a.contains(b)){
                return count;
            }
            else{
                a += newString;
                count++;
            }
        }
        return -1;
    }
}
