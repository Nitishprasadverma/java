public class patternSubStr {
   public static void main(String[] args) {
  String str = "abab";
  System.out.println(repeatedSubstringPattern(str));
   } 
   static boolean  repeatedSubstringPattern(String s) {
    int n = s.length();
    for(int l = n / 2; l >= 1; l--){

        if(n % l == 0){
         String subStr = s.substring(0,l);
         StringBuilder sb = new StringBuilder();
         for(int j = 1; j <= n / l; j++){
            sb.append(subStr);
           
         }
        if(sb.toString().equals(s)){
            return true;
        }
        }
        
    }
    return false;
   }
}
