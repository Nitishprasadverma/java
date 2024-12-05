public class makesub2825 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ad";
       
       System.out.println(canMakeSubsequence(str1, str2));
    }
    static boolean canMakeSubsequence(String str1, String str2){
        int i = 0; int j = 0;
        while(i < str1.length() && j < str2.length()){
            if(str2.charAt(j) == str1.charAt(i) || (str1.charAt(i) - 'a' + 1) %26 == str2.charAt(j) - 'a'){
                j++;
            }
            
            if(j == str2.length()) return true;
            i++;
        }
        return false;
    }
}
