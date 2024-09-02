
public class perfromance {
    public static void main(String[] args) {
        String str = "";

        //wastage of a lot of memory by using string bcz string creating again and again new one rather than upadating the existing one .
        for(int i  = 0; i <26; i++){
            char ch = (char)('a' + i);
            str  += ch;
        }
        System.out.println(str);
    }

}
