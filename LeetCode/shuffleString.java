// import java.util.*;
public class shuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));
    }

    static String restoreString(String s, int[] indices){
     char[] chararr = new char[s.length()];

     for(int i   = 0; i < indices.length; i++){
        chararr[indices[i]] = s.charAt(i);
        
        System.out.println(chararr[i]);
     }
     return new String(chararr);
    }
}
