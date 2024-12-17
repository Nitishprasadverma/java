public class Reverseprefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    static String reversePrefix(String word, char ch) {

        int firstOcc = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                firstOcc = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        if(firstOcc == -1) return word;
        if (firstOcc != -1) {
            for (int i = firstOcc; i >= 0; i--) {
                sb.append(word.charAt(i));
            }

        }

        for(int i = firstOcc + 1; i < word.length(); i++ ){
            sb.append(word.charAt(i));
        }

        return sb.toString();

    }
}
