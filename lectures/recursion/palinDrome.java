package recursion;

public class palinDrome {
    public static void main(String[] args) {
        String str = "MADSM";
        System.out.println(isPalinDrome(str, 0));
    }

    static boolean isPalinDrome(String str, int i){
        if(i >= str.length() / 2) return true;
        if(str.charAt(i) != str.charAt( str.length() - i - 1)) return false;
        return isPalinDrome(str, i + 1);

    }
}
