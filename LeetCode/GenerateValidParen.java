import java.util.ArrayList;
import java.util.List;

public class GenerateValidParen {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(8));
    }
    static List<String> generateParenthesis(int n) {
        List<String> list  = new ArrayList<>();
        int opnCnt =0, clsCnt = 0;
        String s = "";
        generator(s, list, opnCnt, clsCnt, n);
        return list;
    }

    static void generator(String s, List<String> list, int opnCnt, int clsCnt, int n){
        if(opnCnt == n && clsCnt == n){
            list.add(s);
           
            return;
        }

        if(opnCnt < n){
            generator( s+"(", list, opnCnt +1, clsCnt, n);
        }
        if(clsCnt < opnCnt){
            generator(s +")", list, opnCnt , clsCnt + 1, n);
        }
    }


}
